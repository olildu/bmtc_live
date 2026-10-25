package app.chalo.livetracking.universalsearch.ui;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.livetracking.universalsearch.UniversalSearchHelper;
import app.chalo.livetracking.universalsearch.data.model.ui.UniversalSearchPlacesAndStopsInfoModel;
import app.chalo.location.LatLng;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.recent.model.app.RecentStopAppModel;
import app.chalo.recent.model.app.UniversalSearchDescriptiveLocationAppModel;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultState;
import app.chalo.universalsearch.data.DestinationAfterUniversalSearch;
import defpackage.hq0;
import defpackage.um1;
import defpackage.vo1;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent$handlePickerStopItemClickIntent$1", f = "UniversalPickerComponent.kt", l = {848, 854}, m = "invokeSuspend", v = 1)
final class UniversalPickerComponent$handlePickerStopItemClickIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UniversalSearchPlacesAndStopsInfoModel $stopInfo;
    Object L$0;
    int label;
    final /* synthetic */ UniversalPickerComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5046a;

        static {
            int[] iArr = new int[DestinationAfterUniversalSearch.values().length];
            try {
                iArr[DestinationAfterUniversalSearch.TRIP_PLANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DestinationAfterUniversalSearch.ACTIVITY_RESULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DestinationAfterUniversalSearch.CITY_LOCATION_SEARCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f5046a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalPickerComponent$handlePickerStopItemClickIntent$1(UniversalPickerComponent universalPickerComponent, UniversalSearchPlacesAndStopsInfoModel universalSearchPlacesAndStopsInfoModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = universalPickerComponent;
        this.$stopInfo = universalSearchPlacesAndStopsInfoModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UniversalPickerComponent$handlePickerStopItemClickIntent$1(this.this$0, this.$stopInfo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((UniversalPickerComponent$handlePickerStopItemClickIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String strN;
        KotlinToastManager kotlinToastManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i != 0) {
            if (i == 1) {
                ResultKt.b(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlinToastManager = (KotlinToastManager) this.L$0;
                ResultKt.b(obj);
            }
            hq0.s(kotlinToastManager, (String) obj);
            return unit;
        }
        ResultKt.b(obj);
        UniversalSearchHelper universalSearchHelper = this.this$0.n;
        UniversalSearchPlacesAndStopsInfoModel universalSearchPlacesAndStopsInfoModel = this.$stopInfo;
        Intrinsics.i(universalSearchPlacesAndStopsInfoModel, "<this>");
        String str = universalSearchPlacesAndStopsInfoModel.d;
        String str2 = universalSearchPlacesAndStopsInfoModel.h;
        StopAppModel stopAppModel = new StopAppModel(str, universalSearchPlacesAndStopsInfoModel.e, universalSearchPlacesAndStopsInfoModel.g, universalSearchPlacesAndStopsInfoModel.f, str2, null);
        this.label = 1;
        obj = universalSearchHelper.d(stopAppModel, this);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
        RecentStopAppModel recentStopAppModel = (RecentStopAppModel) obj;
        if (recentStopAppModel == null) {
            UniversalPickerComponent universalPickerComponent = this.this$0;
            KotlinToastManager kotlinToastManager2 = universalPickerComponent.E;
            this.L$0 = kotlinToastManager2;
            this.label = 2;
            obj = universalPickerComponent.t.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
            if (obj != coroutineSingletons) {
                kotlinToastManager = kotlinToastManager2;
                hq0.s(kotlinToastManager, (String) obj);
                return unit;
            }
            return coroutineSingletons;
        }
        UniversalSearchPlacesAndStopsInfoModel universalSearchPlacesAndStopsInfoModel2 = this.$stopInfo;
        String str3 = universalSearchPlacesAndStopsInfoModel2.h;
        LatLng latLng = universalSearchPlacesAndStopsInfoModel2.g;
        if (str3 == null || str3.length() == 0) {
            strN = this.$stopInfo.e;
        } else {
            UniversalSearchPlacesAndStopsInfoModel universalSearchPlacesAndStopsInfoModel3 = this.$stopInfo;
            strN = vo1.n(universalSearchPlacesAndStopsInfoModel3.e, ", ", universalSearchPlacesAndStopsInfoModel3.h);
        }
        UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel = new UniversalSearchDescriptiveLocationAppModel(str3, strN, this.$stopInfo.d, "searchPartnerChaloStop", latLng);
        int i2 = WhenMappings.f5046a[((UniversalPickerViewState) this.this$0.f.getValue()).n.ordinal()];
        if (i2 == 1) {
            UniversalPickerComponent universalPickerComponent2 = this.this$0;
            universalPickerComponent2.q0(new um1(universalPickerComponent2, universalSearchDescriptiveLocationAppModel, 3));
            return unit;
        }
        if (i2 == 2) {
            UniversalPickerComponent universalPickerComponent3 = this.this$0;
            String str4 = universalPickerComponent3.k.h;
            if (str4 != null) {
                Json json = ChaloJson.b;
                StopAppModel stopAppModel2 = recentStopAppModel.g;
                json.getClass();
                universalPickerComponent3.I0(str4, new UniversalSearchResultState(json.a(StopAppModel.INSTANCE.serializer(), stopAppModel2), null, recentStopAppModel.h.name(), null, 10));
            }
        } else if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return unit;
    }
}
