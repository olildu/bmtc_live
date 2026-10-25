package app.chalo.onboarding.citylocationselection.ui;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.behaviour.policy.CityAutoSelectionApplicable;
import app.chalo.constants.Source;
import app.chalo.extensions.StringExtsKt;
import app.chalo.helper.ChaloAppFeatureHelper;
import app.chalo.location.LatLng;
import app.chalo.models.BasicCityInfoAppModel;
import app.chalo.onboarding.citylocationselection.CityMetaPropsLocalDataSource$getCurrentSelectedCityId$$inlined$map$1;
import defpackage.ch;
import defpackage.ko;
import defpackage.wn;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent$handleInitializationIntent$1", f = "CityLocationSelectionComponent.kt", l = {TypedValues.TransitionType.TYPE_AUTO_TRANSITION, 734}, m = "invokeSuspend", v = 1)
final class CityLocationSelectionComponent$handleInitializationIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CityLocationSelectionIntent.InitializationIntent $intent;
    int I$0;
    int I$1;
    Object L$0;
    int label;
    final /* synthetic */ CityLocationSelectionComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6575a;

        static {
            int[] iArr = new int[CityLocationSelectionSource.values().length];
            try {
                iArr[CityLocationSelectionSource.SplashScreen.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CityLocationSelectionSource.LanguageSelectionScreen.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CityLocationSelectionSource.LoginScreen.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CityLocationSelectionSource.OldCitySelectionScreen.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CityLocationSelectionSource.HomeScreen.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CityLocationSelectionSource.RegularBusScreen.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CityLocationSelectionSource.CityDiscontinuedScreen.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CityLocationSelectionSource.Unknown.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f6575a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CityLocationSelectionComponent$handleInitializationIntent$1(CityLocationSelectionIntent.InitializationIntent initializationIntent, CityLocationSelectionComponent cityLocationSelectionComponent, Continuation continuation) {
        super(2, continuation);
        this.$intent = initializationIntent;
        this.this$0 = cityLocationSelectionComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CityLocationSelectionComponent$handleInitializationIntent$1(this.$intent, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CityLocationSelectionComponent$handleInitializationIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0112  */
    /* JADX WARN: Code duplicated, block: B:53:0x011a A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0017, B:48:0x010e, B:51:0x0114, B:53:0x011a, B:56:0x0134, B:57:0x0139, B:59:0x0159, B:14:0x0030, B:21:0x0058, B:23:0x006e, B:25:0x0072, B:28:0x00ab, B:29:0x00b0, B:30:0x00b1, B:31:0x00b9, B:32:0x00bc, B:33:0x00c1, B:34:0x00c2, B:35:0x00c6, B:37:0x00cf, B:39:0x00d5, B:42:0x00e3, B:43:0x00ea, B:44:0x00ed, B:17:0x0040), top: B:67:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0134 A[Catch: all -> 0x001c, TRY_ENTER, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0017, B:48:0x010e, B:51:0x0114, B:53:0x011a, B:56:0x0134, B:57:0x0139, B:59:0x0159, B:14:0x0030, B:21:0x0058, B:23:0x006e, B:25:0x0072, B:28:0x00ab, B:29:0x00b0, B:30:0x00b1, B:31:0x00b9, B:32:0x00bc, B:33:0x00c1, B:34:0x00c2, B:35:0x00c6, B:37:0x00cf, B:39:0x00d5, B:42:0x00e3, B:43:0x00ea, B:44:0x00ed, B:17:0x0040), top: B:67:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0159 A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0017, B:48:0x010e, B:51:0x0114, B:53:0x011a, B:56:0x0134, B:57:0x0139, B:59:0x0159, B:14:0x0030, B:21:0x0058, B:23:0x006e, B:25:0x0072, B:28:0x00ab, B:29:0x00b0, B:30:0x00b1, B:31:0x00b9, B:32:0x00bc, B:33:0x00c1, B:34:0x00c2, B:35:0x00c6, B:37:0x00cf, B:39:0x00d5, B:42:0x00e3, B:43:0x00ea, B:44:0x00ed, B:17:0x0040), top: B:67:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0171  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CityLocationSelectionSource cityLocationSelectionSource;
        int i;
        int i2;
        int i3;
        int i4;
        CityLocationSelectionSource cityLocationSelectionSource2;
        CityLocationSelectionLayoutType cityLocationSelectionLayoutType;
        CityLocationSelectionComponent cityLocationSelectionComponent;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = this.label;
        Unit unit = Unit.f17538a;
        int i6 = 1;
        try {
            if (i5 == 0) {
                ResultKt.b(obj);
                CityLocationSelectionSource cityLocationSelectionSource3 = this.$intent.f6582a;
                this.this$0.getClass();
                ChaloAppFeatureHelper chaloAppFeatureHelper = this.this$0.E;
                this.L$0 = cityLocationSelectionSource3;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                Object objH = chaloAppFeatureHelper.h(this);
                if (objH != coroutineSingletons) {
                    cityLocationSelectionSource = cityLocationSelectionSource3;
                    obj = objH;
                    i = 0;
                    i2 = 0;
                }
                return coroutineSingletons;
            }
            if (i5 == 1) {
                i = this.I$1;
                i2 = this.I$0;
                cityLocationSelectionSource = (CityLocationSelectionSource) this.L$0;
                ResultKt.b(obj);
            } else {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i3 = this.I$1;
                i4 = this.I$0;
                cityLocationSelectionSource2 = (CityLocationSelectionSource) this.L$0;
                ResultKt.b(obj);
            }
            str = (String) obj;
            if (str == null) {
                str = "";
            }
            if (str.length() > 0) {
                CityLocationSelectionComponent cityLocationSelectionComponent2 = this.this$0;
                String lowerCase = str.toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase, "toLowerCase(...)");
                cityLocationSelectionComponent2.I0(str, StringExtsKt.a(lowerCase));
                this.this$0.I = false;
                return unit;
            }
            cityLocationSelectionLayoutType = CityLocationSelectionLayoutType.LocationPermission;
            i2 = i4;
            cityLocationSelectionSource = cityLocationSelectionSource2;
            i = i3;
            this.this$0.E0(new wn(9, cityLocationSelectionSource, cityLocationSelectionLayoutType));
            AnalyticsContractImplKt.a(this.this$0.p, "city location selection screen opened", Source.CITY_SELECTION_SCREEN, cityLocationSelectionSource.toSource(), null, 56);
            if (i2 != 0) {
                this.this$0.E0(new ko(27));
                this.this$0.L0();
                i6 = i;
            }
            cityLocationSelectionComponent = this.this$0;
            cityLocationSelectionComponent.I = false;
            if (i6 != 0) {
                cityLocationSelectionComponent.M0(new CityLocationSelectionIntent.StartLocationUpdates(cityLocationSelectionSource));
            }
            return unit;
            CityAutoSelectionApplicable cityAutoSelectionApplicable = (CityAutoSelectionApplicable) obj;
            this.this$0.E0(new wn(8, cityAutoSelectionApplicable, cityLocationSelectionSource));
            if (!Intrinsics.d(cityAutoSelectionApplicable, CityAutoSelectionApplicable.No.f999a)) {
                if (!(cityAutoSelectionApplicable instanceof CityAutoSelectionApplicable.Yes)) {
                    throw new NoWhenBranchMatchedException();
                }
                CityLocationSelectionComponent cityLocationSelectionComponent3 = this.this$0;
                cityLocationSelectionComponent3.H = true;
                cityLocationSelectionComponent3.E0(new ch(cityLocationSelectionSource, 28));
                AnalyticsContractImplKt.a(this.this$0.p, "city location selection screen opened", Source.CITY_SELECTION_SCREEN, cityLocationSelectionSource.toSource(), null, 56);
                CityLocationSelectionComponent cityLocationSelectionComponent4 = this.this$0;
                LatLng latLng = ((CityAutoSelectionApplicable.Yes) cityAutoSelectionApplicable).f1000a;
                cityLocationSelectionComponent4.H = true;
                BuildersKt.d(cityLocationSelectionComponent4.j, null, null, new CityLocationSelectionComponent$fetchCityIdAndNameFromLocation$1(cityLocationSelectionComponent4, latLng, null), 3);
                this.this$0.I = false;
                return unit;
            }
            switch (WhenMappings.f6575a[cityLocationSelectionSource.ordinal()]) {
                case 1:
                    CityMetaPropsLocalDataSource$getCurrentSelectedCityId$$inlined$map$1 cityMetaPropsLocalDataSource$getCurrentSelectedCityId$$inlined$map$1 = new CityMetaPropsLocalDataSource$getCurrentSelectedCityId$$inlined$map$1(this.this$0.s.b.getData());
                    this.L$0 = cityLocationSelectionSource;
                    this.I$0 = i2;
                    this.I$1 = i;
                    this.label = 2;
                    obj = FlowKt.v(cityMetaPropsLocalDataSource$getCurrentSelectedCityId$$inlined$map$1, this);
                    if (obj != coroutineSingletons) {
                        i3 = i;
                        i4 = i2;
                        cityLocationSelectionSource2 = cityLocationSelectionSource;
                        str = (String) obj;
                        if (str == null) {
                            str = "";
                        }
                        if (str.length() > 0) {
                            CityLocationSelectionComponent cityLocationSelectionComponent5 = this.this$0;
                            String lowerCase2 = str.toLowerCase(Locale.ROOT);
                            Intrinsics.h(lowerCase2, "toLowerCase(...)");
                            cityLocationSelectionComponent5.I0(str, StringExtsKt.a(lowerCase2));
                            this.this$0.I = false;
                            return unit;
                        }
                        cityLocationSelectionLayoutType = CityLocationSelectionLayoutType.LocationPermission;
                        i2 = i4;
                        cityLocationSelectionSource = cityLocationSelectionSource2;
                        i = i3;
                        this.this$0.E0(new wn(9, cityLocationSelectionSource, cityLocationSelectionLayoutType));
                        AnalyticsContractImplKt.a(this.this$0.p, "city location selection screen opened", Source.CITY_SELECTION_SCREEN, cityLocationSelectionSource.toSource(), null, 56);
                        if (i2 != 0) {
                            this.this$0.E0(new ko(27));
                            this.this$0.L0();
                            i6 = i;
                        }
                        cityLocationSelectionComponent = this.this$0;
                        cityLocationSelectionComponent.I = false;
                        if (i6 != 0) {
                            cityLocationSelectionComponent.M0(new CityLocationSelectionIntent.StartLocationUpdates(cityLocationSelectionSource));
                        }
                        return unit;
                    }
                    return coroutineSingletons;
                case 2:
                case 3:
                    cityLocationSelectionLayoutType = CityLocationSelectionLayoutType.LocationPermission;
                    this.this$0.E0(new wn(9, cityLocationSelectionSource, cityLocationSelectionLayoutType));
                    AnalyticsContractImplKt.a(this.this$0.p, "city location selection screen opened", Source.CITY_SELECTION_SCREEN, cityLocationSelectionSource.toSource(), null, 56);
                    if (i2 != 0) {
                        this.this$0.E0(new ko(27));
                        this.this$0.L0();
                        i6 = i;
                    }
                    cityLocationSelectionComponent = this.this$0;
                    cityLocationSelectionComponent.I = false;
                    if (i6 != 0) {
                        cityLocationSelectionComponent.M0(new CityLocationSelectionIntent.StartLocationUpdates(cityLocationSelectionSource));
                    }
                    return unit;
                case 4:
                    BasicCityInfoAppModel basicCityInfoAppModel = this.$intent.b;
                    if (basicCityInfoAppModel != null) {
                        this.this$0.I0(basicCityInfoAppModel.f5567a, basicCityInfoAppModel.b);
                        this.this$0.I = false;
                        return unit;
                    }
                    this.this$0.H = true;
                    cityLocationSelectionLayoutType = CityLocationSelectionLayoutType.None;
                    i2 = 1;
                    this.this$0.E0(new wn(9, cityLocationSelectionSource, cityLocationSelectionLayoutType));
                    AnalyticsContractImplKt.a(this.this$0.p, "city location selection screen opened", Source.CITY_SELECTION_SCREEN, cityLocationSelectionSource.toSource(), null, 56);
                    if (i2 != 0) {
                        this.this$0.E0(new ko(27));
                        this.this$0.L0();
                        i6 = i;
                    }
                    cityLocationSelectionComponent = this.this$0;
                    cityLocationSelectionComponent.I = false;
                    if (i6 != 0) {
                        cityLocationSelectionComponent.M0(new CityLocationSelectionIntent.StartLocationUpdates(cityLocationSelectionSource));
                    }
                    return unit;
                case 5:
                case 6:
                case 7:
                    this.this$0.H = true;
                    cityLocationSelectionLayoutType = CityLocationSelectionLayoutType.None;
                    i2 = 1;
                    this.this$0.E0(new wn(9, cityLocationSelectionSource, cityLocationSelectionLayoutType));
                    AnalyticsContractImplKt.a(this.this$0.p, "city location selection screen opened", Source.CITY_SELECTION_SCREEN, cityLocationSelectionSource.toSource(), null, 56);
                    if (i2 != 0) {
                        this.this$0.E0(new ko(27));
                        this.this$0.L0();
                        i6 = i;
                    }
                    cityLocationSelectionComponent = this.this$0;
                    cityLocationSelectionComponent.I = false;
                    if (i6 != 0) {
                        cityLocationSelectionComponent.M0(new CityLocationSelectionIntent.StartLocationUpdates(cityLocationSelectionSource));
                    }
                    return unit;
                case 8:
                    cityLocationSelectionLayoutType = CityLocationSelectionLayoutType.None;
                    this.this$0.E0(new wn(9, cityLocationSelectionSource, cityLocationSelectionLayoutType));
                    AnalyticsContractImplKt.a(this.this$0.p, "city location selection screen opened", Source.CITY_SELECTION_SCREEN, cityLocationSelectionSource.toSource(), null, 56);
                    if (i2 != 0) {
                        this.this$0.E0(new ko(27));
                        this.this$0.L0();
                        i6 = i;
                    }
                    cityLocationSelectionComponent = this.this$0;
                    cityLocationSelectionComponent.I = false;
                    if (i6 != 0) {
                        cityLocationSelectionComponent.M0(new CityLocationSelectionIntent.StartLocationUpdates(cityLocationSelectionSource));
                    }
                    return unit;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Throwable th) {
            this.this$0.I = false;
            throw th;
        }
    }
}
