package com.wallissoftware.restdispatchtest.client.application.home;

import javax.inject.Inject;

import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.dispatch.rest.client.RestDispatch;
import com.gwtplatform.dispatch.rest.delegates.client.ResourceDelegate;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.wallissoftware.restdispatchtest.client.application.ApplicationPresenter;
import com.wallissoftware.restdispatchtest.client.place.NameTokens;
import com.wallissoftware.restdispatchtest.shared.api.SimpleResource;

public class HomePagePresenter extends Presenter<HomePagePresenter.MyView, HomePagePresenter.MyProxy> {
	interface MyView extends View {
	}

	@ProxyStandard
	@NameToken(NameTokens.home)
	interface MyProxy extends ProxyPlace<HomePagePresenter> {
	}

	@Inject
	HomePagePresenter(EventBus eventBus, MyView view, MyProxy proxy, RestDispatch dispatcher, ResourceDelegate<SimpleResource> simpleDelegate) {
		super(eventBus, view, proxy, ApplicationPresenter.SLOT_SetMainContent);
	}
}