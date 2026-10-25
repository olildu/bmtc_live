package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Movie;
import android.graphics.Picture;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.foundation.text.input.internal.InputMethodManagerImpl;
import androidx.compose.material3.DefaultTwoRowsTopAppBarOverride;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.TwoRowsTopAppBarOverrideScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Size;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.window.embedding.ExtensionEmbeddingBackend;
import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.analytics.firebase.FirebaseAnalyticsDelegateAndroid;
import app.chalo.checkout.paymentprovider.inai.InaiSdkCheckoutAndroid;
import app.chalo.checkout.paymentprovider.inai.InaiSdkConfig;
import app.chalo.constants.Source;
import app.chalo.core.navigation.root.DefaultRootComponent;
import app.chalo.electricitybill.ui.ebillamount.EBillAmountIntent;
import app.chalo.electricitybill.ui.ebillamount.EbillAmountComponent;
import app.chalo.extensions.JsonElementExtensionsKt;
import app.chalo.home.analytics.HomeScreenAnalyticsHelper;
import app.chalo.home.contract.HomeScreenInfoHelper;
import app.chalo.home.ui.base.AppUpdateType;
import app.chalo.juspay.JuspayHyperPaymentsCallbackAdapter;
import app.chalo.juspay.JuspaySdkAdapterImpl;
import app.chalo.livetracking.stoptripplannerresult.uistate.BusInfoCtaUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.ItineraryCardCtaUIState;
import app.chalo.livetracking.stoptripplannerresult.uistate.ItineraryLegItemUiState;
import app.chalo.multimodalticket.groupticketsummary.ui.uistate.GroupTicketLegFareUiState;
import app.chalo.multimodalticket.ui.uistates.FareBreakupSectionUIState;
import app.chalo.ncmc.ui.entercarddetails.EnterCardDetailsComponent;
import app.chalo.ncmc.ui.entercarddetails.EnterCardDetailsRestoredState;
import app.chalo.ncmc.ui.entercarddetails.EnterCardDetailsViewState;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.reportproblem.FreshChatRestoreIdReceiver;
import app.chalo.scenes.args.SplashArgs;
import app.chalo.security.encryption.utils.KeyStoreUtilsAndroid;
import app.chalo.superpass.data.features.DigitalTripReceiptFeature;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.RegularBusTicketCtaUiState;
import coil3.Extras;
import coil3.ExtrasKt;
import coil3.ImageLoader;
import coil3.Image_androidKt;
import coil3.decode.DecodeResult;
import coil3.decode.ImageSource;
import coil3.gif.AnimatedTransformation;
import coil3.gif.GifDecoder;
import coil3.gif.ImageRequestsKt;
import coil3.gif.MovieDrawable;
import coil3.gif.PixelOpacity;
import coil3.gif.internal.FrameDelayRewritingSourceKt;
import coil3.memory.MemoryCache;
import coil3.memory.RealMemoryCache;
import coil3.memory.RealStrongMemoryCache;
import coil3.memory.RealWeakMemoryCache;
import coil3.request.ImageRequests_androidKt;
import coil3.request.Options;
import coil3.util.BitmapsKt;
import com.google.accompanist.drawablepainter.DrawablePainter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.inmobi.media.C2533k0;
import defpackage.m4;
import defpackage.tx;
import in.juspay.hyper.constants.LogSubCategory;
import io.github.alexzhirkevich.compottie.ExpressionsRuntimeImpl;
import io.github.alexzhirkevich.compottie.internal.animation.ExpressionProperty;
import io.github.alexzhirkevich.compottie.internal.animation.expressions.ExpressionEvaluatorKt;
import io.inai.android_sdk.InaiCheckout;
import io.inai.android_sdk.InaiConfig;
import io.inai.android_sdk.InaiCrashlyticsHandler;
import io.inai.android_sdk.helpers.InaiBaseUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.internal.InlineClassDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import okhttp3.internal.http2.Http2Connection;
import org.apache.commons.io.FileUtils;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.android.scope.AndroidScopeComponent;
import org.koin.androidx.scope.AndroidScopeArchetypesKt;
import org.koin.androidx.scope.ComponentActivityExtKt$createScopeForCurrentLifecycle$1;
import org.koin.androidx.scope.ScopeFragment;
import org.koin.core.Koin;
import org.koin.core.component.KoinScopeComponentKt;
import org.koin.core.logger.EmptyLogger;
import org.koin.core.qualifier.TypeQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xx implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20058a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xx(Object obj, int i) {
        this.f20058a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0266  */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v16, types: [fi0] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Exception {
        Bitmap.Config config;
        int i = this.f20058a;
        Unit unit = Unit.f17538a;
        Object obj = this.b;
        switch (i) {
            case 0:
                List listR = ((DefaultRootComponent) obj).b;
                if (listR.isEmpty()) {
                    listR = CollectionsKt.R(SplashArgs.INSTANCE);
                }
                return listR;
            case 1:
                return DefaultTextContextMenuDropdownProvider_androidKt.OpenContextMenu$lambda$1$0((TextContextMenuSession) obj);
            case 2:
                return Float.valueOf(DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$5$lambda$4((TwoRowsTopAppBarOverrideScope) obj));
            case 3:
                return CoroutineScopeKt.a(((DigitalTripReceiptFeature) obj).f9522a.b());
            case 4:
                ((RegularBusTicketCtaUiState) obj).d.invoke();
                return unit;
            case 5:
                final DrawablePainter drawablePainter = (DrawablePainter) obj;
                return new Drawable.Callback() { // from class: com.google.accompanist.drawablepainter.DrawablePainter$callback$2$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // android.graphics.drawable.Drawable.Callback
                    public final void invalidateDrawable(Drawable d) {
                        Intrinsics.i(d, "d");
                        DrawablePainter drawablePainter2 = drawablePainter;
                        MutableState mutableState = drawablePainter2.b;
                        mutableState.setValue(Integer.valueOf(((Number) mutableState.getValue()).intValue() + 1));
                        drawablePainter2.c.setValue(Size.m4422boximpl(DrawablePainterKt.a(drawablePainter2.f13050a)));
                    }

                    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
                    @Override // android.graphics.drawable.Drawable.Callback
                    public final void scheduleDrawable(Drawable d, Runnable what, long j) {
                        Intrinsics.i(d, "d");
                        Intrinsics.i(what, "what");
                        ((Handler) DrawablePainterKt.f13053a.getValue()).postAtTime(what, j);
                    }

                    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
                    @Override // android.graphics.drawable.Drawable.Callback
                    public final void unscheduleDrawable(Drawable d, Runnable what) {
                        Intrinsics.i(d, "d");
                        Intrinsics.i(what, "what");
                        ((Handler) DrawablePainterKt.f13053a.getValue()).removeCallbacks(what);
                    }
                };
            case 6:
                return Float.valueOf(DrawerState.anchoredDraggableState$lambda$3((DrawerState) obj));
            case 7:
                ((EbillAmountComponent) obj).G0(EBillAmountIntent.NextBtnClickIntent.f2550a);
                return unit;
            case 8:
                EnterCardDetailsViewState enterCardDetailsViewState = (EnterCardDetailsViewState) ((EnterCardDetailsComponent) obj).f.getValue();
                Intrinsics.i(enterCardDetailsViewState, "<this>");
                return new EnterCardDetailsRestoredState(enterCardDetailsViewState.f6336a, enterCardDetailsViewState.b, enterCardDetailsViewState.c, enterCardDetailsViewState.d, enterCardDetailsViewState.e, enterCardDetailsViewState.f, enterCardDetailsViewState.g, enterCardDetailsViewState.k, enterCardDetailsViewState.l);
            case 9:
                ExpressionProperty expressionProperty = (ExpressionProperty) obj;
                String f = expressionProperty.getF();
                if (f != null) {
                    return ExpressionEvaluatorKt.a(f, expressionProperty);
                }
                return null;
            case 10:
                return ExtensionEmbeddingBackend.splitSupportStatus_delegate$lambda$6((ExtensionEmbeddingBackend) obj);
            case 11:
                return FirebaseAnalytics.getInstance(((FirebaseAnalyticsDelegateAndroid) obj).f878a);
            case 12:
                ScopeFragment scopeFragment = (ScopeFragment) obj;
                Koin koinA = ComponentCallbackExtKt.a(scopeFragment);
                String scopeId = KoinScopeComponentKt.a(scopeFragment);
                Intrinsics.i(scopeId, "scopeId");
                ScopeRegistry scopeRegistry = koinA.c;
                scopeRegistry.getClass();
                final Scope scopeC = (Scope) scopeRegistry.c.get(scopeId);
                if (scopeC == null) {
                    TypeQualifier scopeArchetype = AndroidScopeArchetypesKt.f18809a;
                    Intrinsics.i(scopeArchetype, "scopeArchetype");
                    scopeC = ComponentCallbackExtKt.a(scopeFragment).c(KoinScopeComponentKt.a(scopeFragment), new TypeQualifier(Reflection.a(scopeFragment.getClass())), scopeFragment, scopeArchetype);
                    scopeC.h.add(new ComponentActivityExtKt$createScopeForCurrentLifecycle$1());
                    scopeFragment.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: org.koin.androidx.scope.ComponentActivityExtKt$registerScopeForLifecycle$1
                        @Override // androidx.lifecycle.DefaultLifecycleObserver
                        public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                            tx.a(this, lifecycleOwner);
                        }

                        @Override // androidx.lifecycle.DefaultLifecycleObserver
                        public final void onDestroy(LifecycleOwner owner) {
                            Intrinsics.i(owner, "owner");
                            Scope scope = scopeC;
                            m4 m4Var = new m4(scope, 1);
                            synchronized (scope) {
                                m4Var.invoke();
                            }
                            tx.b(this, owner);
                        }

                        @Override // androidx.lifecycle.DefaultLifecycleObserver
                        public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                            tx.c(this, lifecycleOwner);
                        }

                        @Override // androidx.lifecycle.DefaultLifecycleObserver
                        public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
                            tx.d(this, lifecycleOwner);
                        }

                        @Override // androidx.lifecycle.DefaultLifecycleObserver
                        public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                            tx.e(this, lifecycleOwner);
                        }

                        @Override // androidx.lifecycle.DefaultLifecycleObserver
                        public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                            tx.f(this, lifecycleOwner);
                        }
                    });
                }
                EmptyLogger emptyLogger = scopeC.e.f18815a;
                KeyEventDispatcher.Component activity = scopeFragment.getActivity();
                AndroidScopeComponent androidScopeComponent = activity instanceof AndroidScopeComponent ? (AndroidScopeComponent) activity : null;
                Scope scopeI0 = androidScopeComponent != null ? androidScopeComponent.i0() : null;
                if (scopeI0 != null) {
                    emptyLogger.a("Link to parent activity scope: '" + scopeI0.b + '\'');
                    scopeC.c(scopeI0);
                } else {
                    emptyLogger.a("Fragment '" + scopeFragment + "' can't be linked to parent activity scope. No Parent Activity Scope found.");
                }
                return scopeC;
            case 13:
                return FrameworkSQLiteOpenHelper.lazyDelegate$lambda$0((FrameworkSQLiteOpenHelper) obj);
            case 14:
                int i2 = FreshChatRestoreIdReceiver.e;
                return CoroutineScopeKt.a(((CoroutineContextProvider) ((FreshChatRestoreIdReceiver) obj).f9009a.getValue()).b());
            case 15:
                GifDecoder gifDecoder = (GifDecoder) obj;
                ImageSource imageSource = gifDecoder.f11548a;
                Options options = gifDecoder.b;
                ImageSource imageSourceA = FrameDelayRewritingSourceKt.a(imageSource, true);
                try {
                    Movie movieDecodeStream = Movie.decodeStream(imageSourceA.source().q1());
                    AutoCloseableKt.a(imageSourceA, null);
                    if (movieDecodeStream == null || movieDecodeStream.width() <= 0 || movieDecodeStream.height() <= 0) {
                        throw new IllegalStateException("Failed to decode GIF.");
                    }
                    if (movieDecodeStream.isOpaque() && ((Boolean) ExtrasKt.b(options, ImageRequests_androidKt.g)).booleanValue()) {
                        config = Bitmap.Config.RGB_565;
                    } else {
                        config = BitmapsKt.b(ImageRequests_androidKt.a(options)) ? Bitmap.Config.ARGB_8888 : (Bitmap.Config) ExtrasKt.b(options, ImageRequests_androidKt.b);
                    }
                    MovieDrawable movieDrawable = new MovieDrawable(movieDecodeStream, config, options.c);
                    Extras.Key key = ImageRequestsKt.f11549a;
                    if (((Number) ExtrasKt.b(options, key)).intValue() != -2) {
                        int iIntValue = ((Number) ExtrasKt.b(options, key)).intValue();
                        if (iIntValue < -1) {
                            throw new IllegalArgumentException(vo1.j(iIntValue, "Invalid repeatCount: ").toString());
                        }
                        movieDrawable.q = iIntValue;
                    }
                    final Function0 function0 = (Function0) ExtrasKt.b(options, ImageRequestsKt.c);
                    final Function0 function1 = (Function0) ExtrasKt.b(options, ImageRequestsKt.d);
                    if (function0 != null || function1 != null) {
                        movieDrawable.registerAnimationCallback(new Animatable2Compat.AnimationCallback() { // from class: coil3.gif.internal.UtilsKt$animatable2CompatCallbackOf$1
                            @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
                            public final void onAnimationEnd(Drawable drawable) {
                                Function0 function2 = function1;
                                if (function2 != null) {
                                    function2.invoke();
                                }
                            }

                            @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
                            public final void onAnimationStart(Drawable drawable) {
                                Function0 function2 = function0;
                                if (function2 != null) {
                                    function2.invoke();
                                }
                            }
                        });
                    }
                    AnimatedTransformation animatedTransformation = (AnimatedTransformation) ExtrasKt.b(options, ImageRequestsKt.b);
                    movieDrawable.r = animatedTransformation;
                    if (animatedTransformation != null) {
                        Movie movie = movieDrawable.f11550a;
                        if (movie.width() <= 0 || movie.height() <= 0) {
                            movieDrawable.s = null;
                            movieDrawable.t = PixelOpacity.UNCHANGED;
                            movieDrawable.u = false;
                        } else {
                            Picture picture = new Picture();
                            picture.beginRecording(movie.width(), movie.height());
                            movieDrawable.t = animatedTransformation.a();
                            picture.endRecording();
                            movieDrawable.s = picture;
                            movieDrawable.u = true;
                        }
                    } else {
                        movieDrawable.s = null;
                        movieDrawable.t = PixelOpacity.UNCHANGED;
                        movieDrawable.u = false;
                    }
                    movieDrawable.invalidateSelf();
                    return new DecodeResult(Image_androidKt.b(movieDrawable), false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AutoCloseableKt.a(imageSourceA, th);
                        throw th2;
                    }
                }
            case 16:
                UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1 = ((FareBreakupSectionUIState) obj).b;
                if (uiEventHandler$Companion$fromLambda$1 != null) {
                    uiEventHandler$Companion$fromLambda$1.a();
                }
                return unit;
            case 17:
                ((GroupTicketLegFareUiState) obj).e.a();
                return unit;
            case 18:
                ((HomeScreenInfoHelper) obj).q();
                return unit;
            case 19:
                ((HomeScreenAnalyticsHelper) obj).r(AppUpdateType.FLEXIBLE, Source.HOME_SCREEN_TAB);
                return unit;
            case 20:
                return Http2Connection.sendDegradedPingLater$lambda$28((Http2Connection) obj);
            case 21:
                MemoryCache.Builder builder = new MemoryCache.Builder();
                final Context context = ((ImageLoader.Builder) obj).f11467a;
                final double d = 0.2d;
                try {
                    Object systemService = ContextCompat.getSystemService(context, ActivityManager.class);
                    Intrinsics.f(systemService);
                    if (((ActivityManager) systemService).isLowRamDevice()) {
                        d = 0.15d;
                    }
                } catch (Exception unused) {
                }
                if (0.0d > d || d > 1.0d) {
                    throw new IllegalArgumentException("percent must be in the range [0.0, 1.0].");
                }
                builder.f11558a = new Function0() { // from class: fi0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int largeMemoryClass;
                        Context context2 = context;
                        try {
                            Object systemService2 = ContextCompat.getSystemService(context2, ActivityManager.class);
                            Intrinsics.f(systemService2);
                            ActivityManager activityManager = (ActivityManager) systemService2;
                            largeMemoryClass = (context2.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                        } catch (Exception unused2) {
                            largeMemoryClass = 256;
                        }
                        return Long.valueOf((long) (d * ((long) largeMemoryClass) * FileUtils.ONE_MB));
                    }
                };
                RealWeakMemoryCache realWeakMemoryCache = new RealWeakMemoryCache();
                fi0 fi0Var = builder.f11558a;
                if (fi0Var != null) {
                    return new RealMemoryCache(new RealStrongMemoryCache(((Number) fi0Var.invoke()).longValue(), realWeakMemoryCache), realWeakMemoryCache);
                }
                throw new IllegalStateException("maxSizeBytesFactory == null");
            case 22:
                InaiSdkConfig inaiSdkConfig = ((InaiSdkCheckoutAndroid) obj).f1406a;
                String str = inaiSdkConfig.b;
                String str2 = inaiSdkConfig.f1409a;
                InaiConfig inaiConfig = new InaiConfig(str, str2, inaiSdkConfig.c);
                InaiCheckout inaiCheckout = new InaiCheckout();
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                Intrinsics.h(defaultUncaughtExceptionHandler, "Thread.getDefaultUncaughtExceptionHandler()");
                InaiCrashlyticsHandler inaiCrashlyticsHandlerA = InaiCrashlyticsHandler.g.a(defaultUncaughtExceptionHandler);
                InaiCheckout.b = inaiCrashlyticsHandlerA;
                Thread.setDefaultUncaughtExceptionHandler(inaiCrashlyticsHandlerA);
                ArrayList arrayList = InaiBaseUtils.b;
                arrayList.clear();
                if (str2 != null && !StringsKt.F(str2) && str != null && !StringsKt.F(str)) {
                    arrayList.add(new InaiBaseUtils.BreadcrumbsValues("Configuration", "Initialised", InaiBaseUtils.Companion.c(), LogSubCategory.Action.USER, null));
                    inaiCheckout.f16572a = inaiConfig;
                    return inaiCheckout;
                }
                InaiCrashlyticsHandler inaiCrashlyticsHandler = InaiCheckout.b;
                if (inaiCrashlyticsHandler == null) {
                    Intrinsics.q("inaiCrashlyticsHandler");
                    throw null;
                }
                Json.Default r1 = Json.d;
                inaiCrashlyticsHandler.d("Invalid config", r1.a(SerializersKt.b(r1.b, Reflection.d(InaiConfig.class)), inaiConfig));
                throw new Exception("Invalid config");
            case 23:
                return InputMethodManagerImpl.imm_delegate$lambda$0((InputMethodManagerImpl) obj);
            case 24:
                ((ItineraryCardCtaUIState) obj).d.a();
                return unit;
            case 25:
                UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$2 = ((ItineraryLegItemUiState) obj).h;
                if (uiEventHandler$Companion$fromLambda$2 != null) {
                    uiEventHandler$Companion$fromLambda$2.a();
                }
                return unit;
            case 26:
                ((BusInfoCtaUiState) obj).c.a();
                return unit;
            case 27:
                return (ExpressionsRuntimeImpl) obj;
            case 28:
                final JuspaySdkAdapterImpl juspaySdkAdapterImpl = (JuspaySdkAdapterImpl) obj;
                return new JuspayHyperPaymentsCallbackAdapter() { // from class: app.chalo.juspay.JuspaySdkAdapterImpl$juspayResultHandler$2$1
                    /* JADX WARN: Code duplicated, block: B:12:0x0041  */
                    @Override // app.chalo.juspay.JuspayHyperPaymentsCallbackAdapter
                    public void onEvent(JsonObject resultObject) {
                        String strA;
                        Object processResult;
                        JuspaySdkAdapterImpl juspaySdkAdapterImpl2 = juspaySdkAdapterImpl;
                        SharedFlowImpl sharedFlowImpl = juspaySdkAdapterImpl2.d;
                        if (resultObject == null) {
                            sharedFlowImpl.f(JusPaySdkResultAppModel.ResultUnavailable.f4013a);
                            return;
                        }
                        String message = "onEvent: " + resultObject;
                        Intrinsics.i(message, "message");
                        ProcessJuspayResultObjectUseCase processJuspayResultObjectUseCase = juspaySdkAdapterImpl2.b;
                        JsonElement jsonElement = (JsonElement) resultObject.get(C2533k0.KEY_REQUEST_ID);
                        JusPayResultEventType jusPayResultEventType = null;
                        if (jsonElement != null) {
                            ChaloJson chaloJson = ChaloJson.f6455a;
                            JsonPrimitive jsonPrimitiveA = ChaloJson.a(jsonElement);
                            if (jsonPrimitiveA != null) {
                                InlineClassDescriptor inlineClassDescriptor = JsonElementKt.f18192a;
                                if (jsonPrimitiveA instanceof JsonNull) {
                                    strA = null;
                                } else {
                                    strA = jsonPrimitiveA.a();
                                }
                            } else {
                                strA = null;
                            }
                        } else {
                            strA = null;
                        }
                        if (strA == null) {
                            strA = "";
                        }
                        String str3 = strA;
                        try {
                            String strJ = JsonElementExtensionsKt.j(resultObject, NotificationCompat.CATEGORY_EVENT);
                            String message2 = "eventName: " + strJ;
                            Intrinsics.i(message2, "message");
                            JusPayResultEventType.INSTANCE.getClass();
                            for (JusPayResultEventType jusPayResultEventType2 : JusPayResultEventType.getEntries()) {
                                if (StringsKt.x(jusPayResultEventType2.getEventName(), strJ, true)) {
                                    jusPayResultEventType = jusPayResultEventType2;
                                    break;
                                }
                            }
                            JusPayResultEventType jusPayResultEventType3 = jusPayResultEventType;
                            if (jusPayResultEventType3 == null) {
                                jusPayResultEventType3 = JusPayResultEventType.Unknown;
                            }
                            switch (ProcessJuspayResultObjectUseCase.WhenMappings.f4089a[jusPayResultEventType3.ordinal()]) {
                                case 1:
                                    processResult = new JusPaySdkResultAppModel.ShowLoader(str3);
                                    break;
                                case 2:
                                    processResult = new JusPaySdkResultAppModel.HideLoader(str3);
                                    break;
                                case 3:
                                case 4:
                                    processResult = ProcessJuspayResultObjectUseCase.a(resultObject);
                                    break;
                                case 5:
                                case 6:
                                    processResult = JusPaySdkResultAppModel.Unknown.f4016a;
                                    break;
                                case 7:
                                    processResult = JusPaySdkResultAppModel.SessionExpired.f4014a;
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                        } catch (Exception e) {
                            AnalyticsContract analyticsContract = processJuspayResultObjectUseCase.f4088a;
                            Source source = Source.USECASE;
                            AnalyticsContractImplKt.a(analyticsContract, "juspay sdk result object processing error", source, source, MapsKt.i(new Pair("reason", String.valueOf(e.getMessage())), new Pair("result", resultObject.toString()), new Pair(C2533k0.KEY_REQUEST_ID, str3)), 48);
                            String message3 = "EXCEP: " + e.getMessage() + ", requestId: " + str3;
                            Intrinsics.i(message3, "message");
                            processResult = new JusPaySdkResultAppModel.ProcessResult(new JusPayErrorResultAppModel(str3, "", JusPayAction.Unknown, "Error parsing JusPay SDK response", new JuspayErrorResultType.Other("UNKNOWN")));
                        }
                        sharedFlowImpl.f(processResult);
                    }
                };
            default:
                String packageName = ((KeyStoreUtilsAndroid) obj).f9363a.getPackageName();
                int i3 = 17;
                int i4 = 0;
                boolean z = false;
                while (i4 <= i3) {
                    boolean z2 = Intrinsics.k("alphanso-so-and-so".charAt(!z ? i4 : i3), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            return vo1.n(packageName, CLConstants.DOT_SALT_DELIMETER, "alphanso-so-and-so".subSequence(i4, i3 + 1).toString());
                        }
                        i3--;
                    } else if (z2) {
                        i4++;
                    } else {
                        z = true;
                    }
                }
                return vo1.n(packageName, CLConstants.DOT_SALT_DELIMETER, "alphanso-so-and-so".subSequence(i4, i3 + 1).toString());
        }
    }
}
