package app.chalo.webview;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.helper.UrlOpenHelper;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.WebViewArgs;
import app.chalo.uistate.components.LinearProgressIndicatorUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import app.chalo.uistate.toolbar.ToolbarUIStateFactory;
import app.chalo.uistate.webview.WebViewUIState;
import app.chalo.uistate.webview.WebViewUIStateFactory;
import app.chalo.uistate.webview.WebViewUIStateFactory$chromeClientEventHandler$4;
import app.chalo.webview.WebViewScreenComponent;
import app.chalo.webview.WebViewScreenIntent;
import com.arkivanov.decompose.ComponentContext;
import defpackage.hp1;
import defpackage.un1;
import defpackage.zt0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/webview/WebViewScreenComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/webview/WebViewScreenIntent;", "Lapp/chalo/webview/WebViewScreenDataState;", "Lapp/chalo/webview/WebViewScreenUIState;", "Lapp/chalo/webview/WebViewScreenEffect;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WebViewScreenComponent extends ChaloBaseStateMviComponent<WebViewScreenIntent, WebViewScreenDataState, WebViewScreenUIState, WebViewScreenEffect> {
    public final UrlOpenHelper k;
    public final ChaloNavigationManager l;
    public final KotlinToastManager m;
    public final StringProvider n;
    public final AnalyticsContract o;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/webview/WebViewScreenComponent$Companion;", "", "", "OPEN_APP_LINK_ERROR_CODE", "I", "OPEN_DEEPLINK_ERROR_CODE", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public WebViewScreenComponent(WebViewArgs webViewArgs, ComponentContext componentContext, UrlOpenHelper urlOpenHelper, ChaloNavigationManager chaloNavigationManager, KotlinToastManager kotlinToastManager, StringProvider stringProvider, AnalyticsContract analyticsContract) {
        super(componentContext);
        this.k = urlOpenHelper;
        this.l = chaloNavigationManager;
        this.m = kotlinToastManager;
        this.n = stringProvider;
        this.o = analyticsContract;
        F0(new WebViewScreenIntent.InitialisationIntent(webViewArgs.b, webViewArgs.c, webViewArgs.e));
    }

    public final void F0(WebViewScreenIntent webViewScreenIntent) {
        C0(webViewScreenIntent);
        if (webViewScreenIntent instanceof WebViewScreenIntent.InitialisationIntent) {
            E0(new un1((WebViewScreenIntent.InitialisationIntent) webViewScreenIntent, 10));
            return;
        }
        if (webViewScreenIntent instanceof WebViewScreenIntent.WebPageLoadProgress) {
            float f = ((WebViewScreenIntent.WebPageLoadProgress) webViewScreenIntent).f11111a;
            E0(new un1(f != 100.0f ? Float.valueOf(f) : null, 9));
            return;
        }
        if (webViewScreenIntent.equals(WebViewScreenIntent.WebPageLoadFinishedIntent.f11110a)) {
            E0(new hp1(20));
            return;
        }
        boolean z = webViewScreenIntent instanceof WebViewScreenIntent.ProcessAppLinkLoadTriggeredIntent;
        ContextScope contextScope = this.j;
        ChaloNavigationManager chaloNavigationManager = this.l;
        UrlOpenHelper urlOpenHelper = this.k;
        if (z) {
            if (urlOpenHelper.a(((WebViewScreenIntent.ProcessAppLinkLoadTriggeredIntent) webViewScreenIntent).f11108a, null)) {
                ChaloNavigationManagerKt.c(chaloNavigationManager);
                return;
            } else {
                BuildersKt.d(contextScope, null, null, new WebViewScreenComponent$handleProcessAppLinkLoadTriggeredIntent$1(this, null), 3);
                return;
            }
        }
        if (webViewScreenIntent instanceof WebViewScreenIntent.ProcessDeepLinkLoadTriggeredIntent) {
            if (urlOpenHelper.a(((WebViewScreenIntent.ProcessDeepLinkLoadTriggeredIntent) webViewScreenIntent).f11109a, null)) {
                ChaloNavigationManagerKt.c(chaloNavigationManager);
                return;
            } else {
                BuildersKt.d(contextScope, null, null, new WebViewScreenComponent$handleProcessDeepLinkLoadTriggeredIntent$1(this, null), 3);
                return;
            }
        }
        if (!(webViewScreenIntent instanceof WebViewScreenIntent.WebViewLoadErrorReceivedIntent)) {
            throw new NoWhenBranchMatchedException();
        }
        WebViewScreenIntent.WebViewLoadErrorReceivedIntent webViewLoadErrorReceivedIntent = (WebViewScreenIntent.WebViewLoadErrorReceivedIntent) webViewScreenIntent;
        AnalyticsContractImplKt.b(this.o, "webview url load failed", Source.WEB_VIEW_SCREEN, MapsKt.k(new Pair("url", webViewLoadErrorReceivedIntent.f11112a), new Pair("errorCode", String.valueOf(webViewLoadErrorReceivedIntent.c)), new Pair("errorMsg", String.valueOf(webViewLoadErrorReceivedIntent.b))), false, 24);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [lp1] */
    /* JADX WARN: Type inference failed for: r8v1, types: [lp1] */
    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        ToolbarUIState toolbarUIState;
        WebViewUIState webViewUIStateB;
        WebViewScreenDataState webViewScreenDataState = (WebViewScreenDataState) obj;
        boolean z = webViewScreenDataState.c;
        String str = webViewScreenDataState.f11106a;
        Float f = webViewScreenDataState.d;
        if (z) {
            toolbarUIState = null;
        } else {
            String str2 = webViewScreenDataState.b;
            toolbarUIState = new ToolbarUIState(null, str2 != null ? ToolbarUIStateFactory.a(ToolbarUIStateFactory.f10120a, str2, 14) : null, null, null, null, 0.0f, null, null, 253);
        }
        if (str == null || str.length() == 0) {
            webViewUIStateB = null;
        } else {
            final int i = 0;
            WebViewUIStateFactory$chromeClientEventHandler$4 webViewUIStateFactory$chromeClientEventHandler$4A = WebViewUIStateFactory.a(new Function1(this) { // from class: lp1
                public final /* synthetic */ WebViewScreenComponent b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            this.b.F0(new WebViewScreenIntent.WebPageLoadProgress(((Integer) obj2).intValue()));
                            break;
                        case 1:
                            this.b.F0(WebViewScreenIntent.WebPageLoadFinishedIntent.f11110a);
                            break;
                        case 2:
                            String it = (String) obj2;
                            Intrinsics.i(it, "it");
                            this.b.F0(new WebViewScreenIntent.ProcessDeepLinkLoadTriggeredIntent(it));
                            break;
                        default:
                            String it2 = (String) obj2;
                            Intrinsics.i(it2, "it");
                            this.b.F0(new WebViewScreenIntent.ProcessAppLinkLoadTriggeredIntent(it2));
                            break;
                    }
                    return Unit.f17538a;
                }
            });
            final int i2 = 1;
            Function1 function1 = new Function1(this) { // from class: lp1
                public final /* synthetic */ WebViewScreenComponent b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i2) {
                        case 0:
                            this.b.F0(new WebViewScreenIntent.WebPageLoadProgress(((Integer) obj2).intValue()));
                            break;
                        case 1:
                            this.b.F0(WebViewScreenIntent.WebPageLoadFinishedIntent.f11110a);
                            break;
                        case 2:
                            String it = (String) obj2;
                            Intrinsics.i(it, "it");
                            this.b.F0(new WebViewScreenIntent.ProcessDeepLinkLoadTriggeredIntent(it));
                            break;
                        default:
                            String it2 = (String) obj2;
                            Intrinsics.i(it2, "it");
                            this.b.F0(new WebViewScreenIntent.ProcessAppLinkLoadTriggeredIntent(it2));
                            break;
                    }
                    return Unit.f17538a;
                }
            };
            zt0 zt0Var = new zt0(14, this, webViewScreenDataState);
            final int i3 = 2;
            ?? r7 = new Function1(this) { // from class: lp1
                public final /* synthetic */ WebViewScreenComponent b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i3) {
                        case 0:
                            this.b.F0(new WebViewScreenIntent.WebPageLoadProgress(((Integer) obj2).intValue()));
                            break;
                        case 1:
                            this.b.F0(WebViewScreenIntent.WebPageLoadFinishedIntent.f11110a);
                            break;
                        case 2:
                            String it = (String) obj2;
                            Intrinsics.i(it, "it");
                            this.b.F0(new WebViewScreenIntent.ProcessDeepLinkLoadTriggeredIntent(it));
                            break;
                        default:
                            String it2 = (String) obj2;
                            Intrinsics.i(it2, "it");
                            this.b.F0(new WebViewScreenIntent.ProcessAppLinkLoadTriggeredIntent(it2));
                            break;
                    }
                    return Unit.f17538a;
                }
            };
            final int i4 = 3;
            webViewUIStateB = WebViewUIStateFactory.b(str, webViewUIStateFactory$chromeClientEventHandler$4A, WebViewUIStateFactory.c(null, function1, zt0Var, r7, new Function1(this) { // from class: lp1
                public final /* synthetic */ WebViewScreenComponent b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i4) {
                        case 0:
                            this.b.F0(new WebViewScreenIntent.WebPageLoadProgress(((Integer) obj2).intValue()));
                            break;
                        case 1:
                            this.b.F0(WebViewScreenIntent.WebPageLoadFinishedIntent.f11110a);
                            break;
                        case 2:
                            String it = (String) obj2;
                            Intrinsics.i(it, "it");
                            this.b.F0(new WebViewScreenIntent.ProcessDeepLinkLoadTriggeredIntent(it));
                            break;
                        default:
                            String it2 = (String) obj2;
                            Intrinsics.i(it2, "it");
                            this.b.F0(new WebViewScreenIntent.ProcessAppLinkLoadTriggeredIntent(it2));
                            break;
                    }
                    return Unit.f17538a;
                }
            }, 1), null, 24);
        }
        return new WebViewScreenUIState(toolbarUIState, webViewUIStateB, f != null ? new LinearProgressIndicatorUIState(f.floatValue() / 100.0f) : null);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new WebViewScreenDataState(null, null, false, null);
    }
}
