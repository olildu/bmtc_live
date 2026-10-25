package defpackage;

import android.os.Build;
import androidx.compose.material3.DefaultBasicAlertDialogOverride;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import app.chalo.android.AndroidDependencyFactory$notificationPlatformNativeDelegate$2$1;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.buildconfig.Environment;
import app.chalo.buildconfig.Platform;
import app.chalo.buildconfig.ProductBrandFlavor;
import app.chalo.buildconfig.ProductFlavor;
import app.chalo.login.truecaller.AndroidTruecallerSetupHandlerImpl;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigDisplayPropsApiResponseModel$$serializer;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigDocumentPropsApiResponseModel$$serializer;
import app.chalo.productpurchase.productselection.data.models.api.AllProductConfigsApiResponseModel;
import app.chalo.productpurchase.productselection.data.models.api.ProductConfigDeserializer;
import app.chalo.walletframework.wallet.data.model.apimodel.response.AllWalletTransactionsResponseApiModel;
import app.chalo.walletframework.wallet.data.model.apimodel.response.AllWalletsSyncResponseApiModel;
import app.chalo.walletframework.wallet.data.model.apimodel.response.ChaloPayApiModel$$serializer;
import app.chalo.walletframework.wallet.data.model.apimodel.response.LoadMoneyResponseApiModel$$serializer;
import app.chalo.walletframework.wallet.data.model.apimodel.response.QuickPayResponseApiModel$$serializer;
import app.chalo.walletframework.wallet.data.model.apimodel.response.WalletMetaResponseApiModel$$serializer;
import chalo_app_kmm.shared.chalo_base.generated.resources.Font0_commonMainKt;
import chalo_app_kmm.shared.onboarding.generated.resources.ActualResourceCollectorsKt;
import io.github.alexzhirkevich.compottie.internal.animation.AnimatedColor;
import io.github.alexzhirkevich.compottie.internal.animation.AnimatedGradient;
import io.github.alexzhirkevich.compottie.internal.animation.AnimatedNumber;
import io.github.alexzhirkevich.compottie.internal.animation.AnimatedShape;
import io.github.alexzhirkevich.compottie.internal.animation.AnimatedShapeKt;
import io.github.alexzhirkevich.compottie.internal.animation.AnimatedTextDocument;
import io.github.alexzhirkevich.compottie.internal.animation.AnimatedTextDocumentKt;
import io.github.alexzhirkevich.compottie.internal.animation.BezierKeyframe$$serializer;
import io.github.alexzhirkevich.compottie.internal.animation.ValueKeyframe$$serializer;
import io.github.alexzhirkevich.compottie.internal.animation.VectorKeyframe$$serializer;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.datetime.Clock;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import org.jetbrains.compose.resources.FontResource;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15602a;

    public /* synthetic */ f1(int i) {
        this.f15602a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15602a) {
            case 0:
                Lazy lazy = ActualResourceCollectorsKt.f11328a;
                return new LinkedHashMap();
            case 1:
                Lazy lazy2 = chalo_app_kmm.shared.productbooking.generated.resources.ActualResourceCollectorsKt.f11329a;
                return new LinkedHashMap();
            case 2:
                Lazy lazy3 = chalo_app_kmm.shared.chalo_base.generated.resources.ActualResourceCollectorsKt.f11287a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("notosansbold", (FontResource) Font0_commonMainKt.f11293a.getValue());
                linkedHashMap.put("notosansregular", (FontResource) Font0_commonMainKt.b.getValue());
                linkedHashMap.put("notosanssemibold", (FontResource) Font0_commonMainKt.c.getValue());
                return linkedHashMap;
            case 3:
                return Long.valueOf(Clock.System.f17926a.a().b());
            case 4:
                return Boolean.TRUE;
            case 5:
                return DefaultBasicAlertDialogOverride.INSTANCE;
            case 6:
                AllProductConfigsApiResponseModel.Companion companion = AllProductConfigsApiResponseModel.INSTANCE;
                return new ArrayListSerializer(ProductConfigDeserializer.c);
            case 7:
                AllProductConfigsApiResponseModel.Companion companion2 = AllProductConfigsApiResponseModel.INSTANCE;
                return new ArrayListSerializer(ProductConfigDisplayPropsApiResponseModel$$serializer.f8156a);
            case 8:
                AllProductConfigsApiResponseModel.Companion companion3 = AllProductConfigsApiResponseModel.INSTANCE;
                return new ArrayListSerializer(ProductConfigDocumentPropsApiResponseModel$$serializer.f8160a);
            case 9:
                AllWalletTransactionsResponseApiModel.Companion companion4 = AllWalletTransactionsResponseApiModel.INSTANCE;
                return new ArrayListSerializer(QuickPayResponseApiModel$$serializer.f10988a);
            case 10:
                AllWalletTransactionsResponseApiModel.Companion companion5 = AllWalletTransactionsResponseApiModel.INSTANCE;
                return new ArrayListSerializer(LoadMoneyResponseApiModel$$serializer.f10986a);
            case 11:
                AllWalletTransactionsResponseApiModel.Companion companion6 = AllWalletTransactionsResponseApiModel.INSTANCE;
                return new ArrayListSerializer(ChaloPayApiModel$$serializer.f10980a);
            case 12:
                AllWalletsSyncResponseApiModel.Companion companion7 = AllWalletsSyncResponseApiModel.Companion;
                return new ArrayListSerializer(WalletMetaResponseApiModel$$serializer.f10994a);
            case 13:
                return new LinkedHashMap();
            case 14:
                return new SimpleDateFormat("EEEE", Locale.ENGLISH);
            case 15:
                return new ChaloBuildConfig() { // from class: app.chalo.android.AndroidDependencyFactory$chaloBuildConfig$2$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Environment f885a;
                    public final ProductFlavor b;
                    public final ProductBrandFlavor c;
                    public final Platform d;
                    public final int e;
                    public final String f;
                    public final String g;
                    public final int h;
                    public final String i;
                    public final String j;
                    public final String k;
                    public final String l;

                    {
                        ProductBrandFlavor productBrandFlavor;
                        ProductFlavor next;
                        Environment ENVIRONMENT = BuildConfig.f899a;
                        Intrinsics.h(ENVIRONMENT, "ENVIRONMENT");
                        this.f885a = ENVIRONMENT;
                        ProductFlavor.INSTANCE.getClass();
                        Iterator<ProductFlavor> it = ProductFlavor.getEntries().iterator();
                        do {
                            productBrandFlavor = null;
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!StringsKt.x(next.name(), "primary", true));
                        ProductFlavor productFlavor = next;
                        this.b = productFlavor == null ? ProductFlavor.PRIMARY : productFlavor;
                        ProductBrandFlavor.INSTANCE.getClass();
                        for (ProductBrandFlavor productBrandFlavor2 : ProductBrandFlavor.getEntries()) {
                            if (StringsKt.x(productBrandFlavor2.name(), "bmtc", true)) {
                                productBrandFlavor = productBrandFlavor2;
                                break;
                            }
                        }
                        ProductBrandFlavor productBrandFlavor3 = productBrandFlavor;
                        this.c = productBrandFlavor3 == null ? ProductBrandFlavor.CHALO : productBrandFlavor3;
                        this.d = Platform.ANDROID;
                        this.e = 1342;
                        this.f = "1.0.1";
                        String MODEL = Build.MODEL;
                        Intrinsics.h(MODEL, "MODEL");
                        this.g = MODEL;
                        this.h = Build.VERSION.SDK_INT;
                        this.i = "bmtc";
                        this.j = "v9toqk06dtds";
                        this.k = "YTFkZjM1ZDktNTU2Yi00YjA1LTg4ZDctNmZiNjhjZmUwOGQx";
                        this.l = "691f9035d581eb388d77577e";
                    }

                    @Override // app.chalo.buildconfig.ChaloBuildConfig
                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final int getH() {
                        return this.h;
                    }

                    @Override // app.chalo.buildconfig.ChaloBuildConfig
                    /* JADX INFO: renamed from: c, reason: from getter */
                    public final ProductBrandFlavor getC() {
                        return this.c;
                    }

                    @Override // app.chalo.buildconfig.ChaloBuildConfig
                    /* JADX INFO: renamed from: d, reason: from getter */
                    public final String getF() {
                        return this.f;
                    }

                    @Override // app.chalo.buildconfig.ChaloBuildConfig
                    /* JADX INFO: renamed from: e, reason: from getter */
                    public final int getE() {
                        return this.e;
                    }

                    @Override // app.chalo.buildconfig.ChaloBuildConfig
                    /* JADX INFO: renamed from: f, reason: from getter */
                    public final String getL() {
                        return this.l;
                    }

                    @Override // app.chalo.buildconfig.ChaloBuildConfig
                    /* JADX INFO: renamed from: g, reason: from getter */
                    public final String getK() {
                        return this.k;
                    }

                    @Override // app.chalo.buildconfig.ChaloBuildConfig
                    /* JADX INFO: renamed from: h, reason: from getter */
                    public final Environment getF885a() {
                        return this.f885a;
                    }

                    @Override // app.chalo.buildconfig.ChaloBuildConfig
                    /* JADX INFO: renamed from: i, reason: from getter */
                    public final String getJ() {
                        return this.j;
                    }

                    @Override // app.chalo.buildconfig.ChaloBuildConfig
                    /* JADX INFO: renamed from: j, reason: from getter */
                    public final String getG() {
                        return this.g;
                    }

                    @Override // app.chalo.buildconfig.ChaloBuildConfig
                    /* JADX INFO: renamed from: k, reason: from getter */
                    public final String getI() {
                        return this.i;
                    }

                    @Override // app.chalo.buildconfig.ChaloBuildConfig
                    /* JADX INFO: renamed from: l, reason: from getter */
                    public final Platform getD() {
                        return this.d;
                    }

                    @Override // app.chalo.buildconfig.ChaloBuildConfig
                    /* JADX INFO: renamed from: m, reason: from getter */
                    public final ProductFlavor getB() {
                        return this.b;
                    }

                    @Override // app.chalo.buildconfig.ChaloBuildConfig
                    public final boolean n() {
                        return false;
                    }
                };
            case 16:
                return new AndroidDependencyFactory$notificationPlatformNativeDelegate$2$1();
            case 17:
                Job jobB = SupervisorKt.b();
                DefaultScheduler defaultScheduler = Dispatchers.f17721a;
                return new ContextScope(CoroutineContext.Element.DefaultImpls.d((JobSupport) jobB, MainDispatcherLoader.f17879a));
            case 18:
                Lazy lazy4 = AndroidTruecallerSetupHandlerImpl.d;
                return 100;
            case 19:
                AnimatedColor.Animated.Companion companion8 = AnimatedColor.Animated.INSTANCE;
                return new ArrayListSerializer(VectorKeyframe$$serializer.f16169a);
            case 20:
                AnimatedColor.Default.Companion companion9 = AnimatedColor.Default.INSTANCE;
                return new ArrayListSerializer(FloatSerializer.f18142a);
            case 21:
                AnimatedGradient.Animated.Companion companion10 = AnimatedGradient.Animated.Companion;
                return new ArrayListSerializer(VectorKeyframe$$serializer.f16169a);
            case 22:
                AnimatedGradient.Default.Companion companion11 = AnimatedGradient.Default.Companion;
                return new ArrayListSerializer(FloatSerializer.f18142a);
            case 23:
                AnimatedNumber.Animated.Companion companion12 = AnimatedNumber.Animated.INSTANCE;
                return new ArrayListSerializer(ValueKeyframe$$serializer.f16167a);
            case 24:
                AnimatedShape.Animated.Companion companion13 = AnimatedShape.Animated.Companion;
                return new ArrayListSerializer(BezierKeyframe$$serializer.f16160a);
            case 25:
                return AndroidPath_androidKt.Path();
            case 26:
                return AndroidPath_androidKt.Path();
            case 27:
                Lazy lazy5 = AnimatedShapeKt.f16144a;
                Float fValueOf = Float.valueOf(0.0f);
                List listS = CollectionsKt.S(fValueOf, fValueOf);
                Float fValueOf2 = Float.valueOf(100.0f);
                return CollectionsKt.S(listS, CollectionsKt.S(fValueOf2, fValueOf), CollectionsKt.S(fValueOf2, fValueOf2), CollectionsKt.S(fValueOf, fValueOf2));
            case 28:
                AnimatedTextDocument.Companion companion14 = AnimatedTextDocument.Companion;
                return AnimatedTextDocumentKt.a(4);
            default:
                AnimatedTextDocument.Companion companion15 = AnimatedTextDocument.Companion;
                return AnimatedTextDocumentKt.a(2);
        }
    }
}
