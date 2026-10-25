package app.chalo.compose.webview;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import app.chalo.uistate.webview.PlatformWebViewContract;
import app.chalo.uistate.webview.WebViewChromeClientUIEventHandler;
import app.chalo.uistate.webview.WebViewClientUIEventHandler;
import app.chalo.uistate.webview.WebViewUIState;
import defpackage.hn1;
import defpackage.n;
import defpackage.ol1;
import defpackage.uc;
import defpackage.un1;
import defpackage.wl1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003¨\u0006\u0003²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0002\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"Lapp/chalo/compose/webview/WebViewInternalState;", "webViewState", "existingWebViewState", "chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WebViewComponent_androidKt {
    public static final void a(WebViewState state, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Intrinsics.i(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-868756153);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-868756153, i2, -1, "app.chalo.compose.webview.WebViewComponent (WebViewComponent.android.kt:106)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = state.b;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(WebViewInternalState.j, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue2;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(state);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new ol1(13, state, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function1 function1 = (Function1) objRememberedValue3;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(state);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new un1(state, 8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Function1 function2 = (Function1) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new n(mutableState, mutableState2, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            modifier2 = modifier;
            AndroidView_androidKt.AndroidView(function1, modifier2, null, function2, (Function1) objRememberedValue5, composerStartRestartGroup, (i2 & 112) | 24576, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            modifier2 = modifier;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new hn1(state, modifier2, i, 11));
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x009e  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:67:0x010d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0116  */
    /* JADX WARN: Code duplicated, block: B:71:0x0118  */
    /* JADX WARN: Code duplicated, block: B:76:0x012a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0142  */
    /* JADX WARN: Code duplicated, block: B:81:0x0147  */
    /* JADX WARN: Code duplicated, block: B:84:0x0152  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    public static final void b(final WebViewUIState state, Modifier modifier, Function1 function1, PlatformWebViewContract platformWebViewContract, Composer composer, int i, int i2) {
        int i3;
        Function1 function2;
        boolean z;
        PlatformWebViewContract platformWebViewContract2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        PlatformWebViewContract platformWebViewContract3;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        WebViewInternalState webViewInternalState;
        boolean z2;
        Object objRememberedValue3;
        Function1 function3;
        Object objRememberedValue4;
        WebViewState webViewState;
        boolean z3;
        boolean zChangedInstance;
        Object objRememberedValue5;
        Intrinsics.i(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(1230911092);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                function2 = function1;
                i3 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                if (i4 != 0) {
                    function2 = null;
                }
                if ((i2 & 8) != 0) {
                    platformWebViewContract3 = null;
                } else {
                    platformWebViewContract3 = platformWebViewContract;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1230911092, i3, -1, "app.chalo.compose.webview.WebViewComponent (WebViewComponent.android.kt:25)");
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new CWebChromeClient() { // from class: app.chalo.compose.webview.WebViewComponent_androidKt$WebViewComponent$internalChromeClient$1$1
                        @Override // app.chalo.compose.webview.CWebChromeClient
                        public final void a(int i5) {
                            WebViewChromeClientUIEventHandler webViewChromeClientUIEventHandler = state.b;
                            if (webViewChromeClientUIEventHandler != null) {
                                webViewChromeClientUIEventHandler.b(i5);
                            }
                        }

                        @Override // app.chalo.compose.webview.CWebChromeClient
                        public final void b(String str) {
                            WebViewChromeClientUIEventHandler webViewChromeClientUIEventHandler = state.b;
                            if (webViewChromeClientUIEventHandler != null) {
                                webViewChromeClientUIEventHandler.a(str);
                            }
                        }

                        @Override // app.chalo.compose.webview.CWebChromeClient
                        public final void c(String str, boolean z4) {
                            WebViewChromeClientUIEventHandler webViewChromeClientUIEventHandler = state.b;
                            if (webViewChromeClientUIEventHandler != null) {
                                webViewChromeClientUIEventHandler.c(str, z4);
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                WebViewComponent_androidKt$WebViewComponent$internalChromeClient$1$1 webViewComponent_androidKt$WebViewComponent$internalChromeClient$1$1 = (WebViewComponent_androidKt$WebViewComponent$internalChromeClient$1$1) objRememberedValue;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new CWebViewClient() { // from class: app.chalo.compose.webview.WebViewComponent_androidKt$WebViewComponent$internalWVClient$1$1
                        @Override // app.chalo.compose.webview.CWebViewClient
                        public final void a(String str) {
                            WebViewClientUIEventHandler webViewClientUIEventHandler = state.c;
                            if (webViewClientUIEventHandler != null) {
                                webViewClientUIEventHandler.d(str);
                            }
                        }

                        @Override // app.chalo.compose.webview.CWebViewClient
                        public final void b(String str) {
                            WebViewClientUIEventHandler webViewClientUIEventHandler = state.c;
                            if (webViewClientUIEventHandler != null) {
                                webViewClientUIEventHandler.a(str);
                            }
                        }

                        @Override // app.chalo.compose.webview.CWebViewClient
                        public final boolean c(String str) {
                            WebViewClientUIEventHandler webViewClientUIEventHandler = state.c;
                            if (webViewClientUIEventHandler != null) {
                                return webViewClientUIEventHandler.b(str);
                            }
                            return false;
                        }

                        @Override // app.chalo.compose.webview.CWebViewClient
                        public final void d(Integer num, String str) {
                            WebViewClientUIEventHandler webViewClientUIEventHandler = state.c;
                            if (webViewClientUIEventHandler != null) {
                                webViewClientUIEventHandler.c(num, str);
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                WebViewComponent_androidKt$WebViewComponent$internalWVClient$1$1 webViewComponent_androidKt$WebViewComponent$internalWVClient$1$1 = (WebViewComponent_androidKt$WebViewComponent$internalWVClient$1$1) objRememberedValue2;
                String str = state.f10129a;
                state.d.getClass();
                webViewInternalState = new WebViewInternalState(str, webViewComponent_androidKt$WebViewComponent$internalChromeClient$1$1, webViewComponent_androidKt$WebViewComponent$internalWVClient$1$1, true, false, true, 1, true, state.e);
                if ((i3 & 896) == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new wl1(function2, 29);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                function3 = (Function1) objRememberedValue3;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1594470501, 0, -1, "app.chalo.compose.webview.rememberWebViewState (WebViewComponent.android.kt:168)");
                }
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new WebViewState(webViewInternalState, function3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                webViewState = (WebViewState) objRememberedValue4;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                String str2 = state.f10129a;
                if ((i3 & 14) == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zChangedInstance = composerStartRestartGroup.changedInstance(webViewState) | z3;
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new WebViewComponent_androidKt$WebViewComponent$1$1(state, webViewState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                EffectsKt.LaunchedEffect(str2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 0);
                a(webViewState, modifier, composerStartRestartGroup, i3 & 112);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                platformWebViewContract2 = platformWebViewContract3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                platformWebViewContract2 = platformWebViewContract;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new uc((Object) state, modifier, (Object) function2, (Object) platformWebViewContract2, i, i2, 13));
            }
        }
        i3 |= 384;
        function2 = function1;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
            if (i4 != 0) {
                function2 = null;
            }
            if ((i2 & 8) != 0) {
                platformWebViewContract3 = null;
            } else {
                platformWebViewContract3 = platformWebViewContract;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1230911092, i3, -1, "app.chalo.compose.webview.WebViewComponent (WebViewComponent.android.kt:25)");
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new CWebChromeClient() { // from class: app.chalo.compose.webview.WebViewComponent_androidKt$WebViewComponent$internalChromeClient$1$1
                    @Override // app.chalo.compose.webview.CWebChromeClient
                    public final void a(int i5) {
                        WebViewChromeClientUIEventHandler webViewChromeClientUIEventHandler = state.b;
                        if (webViewChromeClientUIEventHandler != null) {
                            webViewChromeClientUIEventHandler.b(i5);
                        }
                    }

                    @Override // app.chalo.compose.webview.CWebChromeClient
                    public final void b(String str3) {
                        WebViewChromeClientUIEventHandler webViewChromeClientUIEventHandler = state.b;
                        if (webViewChromeClientUIEventHandler != null) {
                            webViewChromeClientUIEventHandler.a(str3);
                        }
                    }

                    @Override // app.chalo.compose.webview.CWebChromeClient
                    public final void c(String str3, boolean z4) {
                        WebViewChromeClientUIEventHandler webViewChromeClientUIEventHandler = state.b;
                        if (webViewChromeClientUIEventHandler != null) {
                            webViewChromeClientUIEventHandler.c(str3, z4);
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            WebViewComponent_androidKt$WebViewComponent$internalChromeClient$1$1 webViewComponent_androidKt$WebViewComponent$internalChromeClient$1$2 = (WebViewComponent_androidKt$WebViewComponent$internalChromeClient$1$1) objRememberedValue;
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new CWebViewClient() { // from class: app.chalo.compose.webview.WebViewComponent_androidKt$WebViewComponent$internalWVClient$1$1
                    @Override // app.chalo.compose.webview.CWebViewClient
                    public final void a(String str3) {
                        WebViewClientUIEventHandler webViewClientUIEventHandler = state.c;
                        if (webViewClientUIEventHandler != null) {
                            webViewClientUIEventHandler.d(str3);
                        }
                    }

                    @Override // app.chalo.compose.webview.CWebViewClient
                    public final void b(String str3) {
                        WebViewClientUIEventHandler webViewClientUIEventHandler = state.c;
                        if (webViewClientUIEventHandler != null) {
                            webViewClientUIEventHandler.a(str3);
                        }
                    }

                    @Override // app.chalo.compose.webview.CWebViewClient
                    public final boolean c(String str3) {
                        WebViewClientUIEventHandler webViewClientUIEventHandler = state.c;
                        if (webViewClientUIEventHandler != null) {
                            return webViewClientUIEventHandler.b(str3);
                        }
                        return false;
                    }

                    @Override // app.chalo.compose.webview.CWebViewClient
                    public final void d(Integer num, String str3) {
                        WebViewClientUIEventHandler webViewClientUIEventHandler = state.c;
                        if (webViewClientUIEventHandler != null) {
                            webViewClientUIEventHandler.c(num, str3);
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            WebViewComponent_androidKt$WebViewComponent$internalWVClient$1$1 webViewComponent_androidKt$WebViewComponent$internalWVClient$1$2 = (WebViewComponent_androidKt$WebViewComponent$internalWVClient$1$1) objRememberedValue2;
            String str3 = state.f10129a;
            state.d.getClass();
            webViewInternalState = new WebViewInternalState(str3, webViewComponent_androidKt$WebViewComponent$internalChromeClient$1$2, webViewComponent_androidKt$WebViewComponent$internalWVClient$1$2, true, false, true, 1, true, state.e);
            if ((i3 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z2) {
                objRememberedValue3 = new wl1(function2, 29);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new wl1(function2, 29);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            function3 = (Function1) objRememberedValue3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1594470501, 0, -1, "app.chalo.compose.webview.rememberWebViewState (WebViewComponent.android.kt:168)");
            }
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new WebViewState(webViewInternalState, function3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            webViewState = (WebViewState) objRememberedValue4;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            String str4 = state.f10129a;
            if ((i3 & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            zChangedInstance = composerStartRestartGroup.changedInstance(webViewState) | z3;
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance) {
                objRememberedValue5 = new WebViewComponent_androidKt$WebViewComponent$1$1(state, webViewState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                objRememberedValue5 = new WebViewComponent_androidKt$WebViewComponent$1$1(state, webViewState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            EffectsKt.LaunchedEffect(str4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 0);
            a(webViewState, modifier, composerStartRestartGroup, i3 & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            platformWebViewContract2 = platformWebViewContract3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            platformWebViewContract2 = platformWebViewContract;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new uc((Object) state, modifier, (Object) function2, (Object) platformWebViewContract2, i, i2, 13));
        }
    }
}
