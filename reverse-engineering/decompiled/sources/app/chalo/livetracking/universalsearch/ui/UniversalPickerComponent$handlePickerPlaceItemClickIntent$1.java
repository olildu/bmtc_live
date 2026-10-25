package app.chalo.livetracking.universalsearch.ui;

import app.chalo.livetracking.universalsearch.UniversalSearchHelper;
import app.chalo.livetracking.universalsearch.data.model.app.PlacesInfoDataAppModel;
import app.chalo.livetracking.universalsearch.data.model.ui.UniversalSearchPlacesAndStopsInfoModel;
import app.chalo.location.LatLng;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import app.chalo.recent.model.app.UniversalSearchDescriptiveLocationAppModel;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultState;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.TripPlannerArgs;
import app.chalo.universalsearch.data.DestinationAfterUniversalSearch;
import defpackage.hq0;
import defpackage.vm1;
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
@DebugMetadata(c = "app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent$handlePickerPlaceItemClickIntent$1", f = "UniversalPickerComponent.kt", l = {932, 940, 956, 965}, m = "invokeSuspend", v = 1)
final class UniversalPickerComponent$handlePickerPlaceItemClickIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UniversalSearchPlacesAndStopsInfoModel $placeInfo;
    Object L$0;
    int label;
    final /* synthetic */ UniversalPickerComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5045a;

        static {
            int[] iArr = new int[DestinationAfterUniversalSearch.values().length];
            try {
                iArr[DestinationAfterUniversalSearch.CITY_LOCATION_SEARCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DestinationAfterUniversalSearch.TRIP_PLANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DestinationAfterUniversalSearch.ACTIVITY_RESULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f5045a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalPickerComponent$handlePickerPlaceItemClickIntent$1(UniversalPickerComponent universalPickerComponent, UniversalSearchPlacesAndStopsInfoModel universalSearchPlacesAndStopsInfoModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = universalPickerComponent;
        this.$placeInfo = universalSearchPlacesAndStopsInfoModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UniversalPickerComponent$handlePickerPlaceItemClickIntent$1(this.this$0, this.$placeInfo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((UniversalPickerComponent$handlePickerPlaceItemClickIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:50:0x011d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0123  */
    /* JADX WARN: Code duplicated, block: B:54:0x0148  */
    /* JADX WARN: Code duplicated, block: B:61:0x0167  */
    /* JADX WARN: Code duplicated, block: B:64:0x0187  */
    /* JADX WARN: Code duplicated, block: B:67:0x018e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objC;
        LatLng latLng;
        KotlinToastManager kotlinToastManager;
        Object objB;
        KotlinToastManager kotlinToastManager2;
        RecentPlaceAppModel recentPlaceAppModel;
        String str;
        String str2;
        LatLng latLng2;
        UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel;
        int i;
        UniversalPickerComponent universalPickerComponent;
        String str3;
        KotlinToastManager kotlinToastManager3;
        Object objB2;
        KotlinToastManager kotlinToastManager4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        Unit unit = Unit.f17538a;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.b(obj);
                objA = obj;
                latLng = (LatLng) objA;
                if (latLng == null) {
                    this.this$0.H0(latLng, this.$placeInfo.b);
                    return unit;
                }
                this.this$0.E0(new vm1(6));
                UniversalPickerComponent universalPickerComponent2 = this.this$0;
                kotlinToastManager = universalPickerComponent2.E;
                this.L$0 = kotlinToastManager;
                this.label = 2;
                objB = universalPickerComponent2.t.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
                if (objB != coroutineSingletons) {
                    kotlinToastManager2 = kotlinToastManager;
                }
                return coroutineSingletons;
            }
            if (i2 != 2) {
                if (i2 == 3) {
                    ResultKt.b(obj);
                    objC = obj;
                    recentPlaceAppModel = (RecentPlaceAppModel) objC;
                    this.this$0.E0(new vm1(7));
                    if (recentPlaceAppModel != null) {
                        UniversalPickerComponent universalPickerComponent3 = this.this$0;
                        kotlinToastManager3 = universalPickerComponent3.E;
                        this.L$0 = kotlinToastManager3;
                        this.label = 4;
                        objB2 = universalPickerComponent3.t.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
                        if (objB2 != coroutineSingletons) {
                            kotlinToastManager4 = kotlinToastManager3;
                        }
                        return coroutineSingletons;
                    }
                    UniversalSearchPlacesAndStopsInfoModel universalSearchPlacesAndStopsInfoModel = this.$placeInfo;
                    String str4 = universalSearchPlacesAndStopsInfoModel.c;
                    String str5 = universalSearchPlacesAndStopsInfoModel.i;
                    String str6 = recentPlaceAppModel.g;
                    str = recentPlaceAppModel.i;
                    if (str == null) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    latLng2 = recentPlaceAppModel.j;
                    universalSearchDescriptiveLocationAppModel = new UniversalSearchDescriptiveLocationAppModel(str6, str2, str4, str5, latLng2);
                    i = WhenMappings.f5045a[((UniversalPickerViewState) this.this$0.f.getValue()).n.ordinal()];
                    if (i != 1) {
                        this.this$0.H0(latLng2, str2);
                        return unit;
                    }
                    if (i != 2) {
                        ChaloNavigationManager chaloNavigationManager = this.this$0.z;
                        Json json = ChaloJson.b;
                        json.getClass();
                        chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new TripPlannerArgs.ResultsScreen(null, json.a(UniversalSearchDescriptiveLocationAppModel.INSTANCE.serializer(), universalSearchDescriptiveLocationAppModel)), null, null, 6));
                        return unit;
                    }
                    if (i == 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    universalPickerComponent = this.this$0;
                    str3 = universalPickerComponent.k.h;
                    if (str3 != null) {
                        Json json2 = ChaloJson.b;
                        json2.getClass();
                        universalPickerComponent.I0(str3, new UniversalSearchResultState(null, json2.a(RecentPlaceAppModel.INSTANCE.serializer(), recentPlaceAppModel), "NONE", null, 9));
                    }
                    return unit;
                }
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlinToastManager4 = (KotlinToastManager) this.L$0;
                ResultKt.b(obj);
                objB2 = obj;
                hq0.s(kotlinToastManager4, (String) objB2);
                return unit;
            }
            kotlinToastManager2 = (KotlinToastManager) this.L$0;
            ResultKt.b(obj);
            objB = obj;
            hq0.s(kotlinToastManager2, (String) objB);
            return unit;
        }
        ResultKt.b(obj);
        this.this$0.E0(new vm1(5));
        int i3 = WhenMappings.f5045a[((UniversalPickerViewState) this.this$0.f.getValue()).n.ordinal()];
        if (i3 == 1) {
            UniversalSearchHelper universalSearchHelper = this.this$0.n;
            UniversalSearchPlacesAndStopsInfoModel universalSearchPlacesAndStopsInfoModel2 = this.$placeInfo;
            String str7 = universalSearchPlacesAndStopsInfoModel2.c;
            String str8 = universalSearchPlacesAndStopsInfoModel2.i;
            this.label = 1;
            objA = universalSearchHelper.d.a(str7, str8, this);
            if (objA != coroutineSingletons) {
                latLng = (LatLng) objA;
                if (latLng == null) {
                    this.this$0.H0(latLng, this.$placeInfo.b);
                    return unit;
                }
                this.this$0.E0(new vm1(6));
                UniversalPickerComponent universalPickerComponent4 = this.this$0;
                kotlinToastManager = universalPickerComponent4.E;
                this.L$0 = kotlinToastManager;
                this.label = 2;
                objB = universalPickerComponent4.t.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
                if (objB != coroutineSingletons) {
                    kotlinToastManager2 = kotlinToastManager;
                    hq0.s(kotlinToastManager2, (String) objB);
                    return unit;
                }
            }
        } else {
            if (i3 != 2 && i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            UniversalSearchHelper universalSearchHelper2 = this.this$0.n;
            UniversalSearchPlacesAndStopsInfoModel universalSearchPlacesAndStopsInfoModel3 = this.$placeInfo;
            Intrinsics.i(universalSearchPlacesAndStopsInfoModel3, "<this>");
            String str9 = universalSearchPlacesAndStopsInfoModel3.c;
            if (str9 == null) {
                str9 = "";
            }
            String str10 = universalSearchPlacesAndStopsInfoModel3.b;
            if (str10 == null) {
                str10 = "";
            }
            PlacesInfoDataAppModel placesInfoDataAppModel = new PlacesInfoDataAppModel(str10, str9, universalSearchPlacesAndStopsInfoModel3.i);
            this.label = 3;
            objC = universalSearchHelper2.c(placesInfoDataAppModel, this);
            if (objC != coroutineSingletons) {
                recentPlaceAppModel = (RecentPlaceAppModel) objC;
                this.this$0.E0(new vm1(7));
                if (recentPlaceAppModel != null) {
                    UniversalSearchPlacesAndStopsInfoModel universalSearchPlacesAndStopsInfoModel4 = this.$placeInfo;
                    String str11 = universalSearchPlacesAndStopsInfoModel4.c;
                    String str12 = universalSearchPlacesAndStopsInfoModel4.i;
                    String str13 = recentPlaceAppModel.g;
                    str = recentPlaceAppModel.i;
                    if (str == null) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    latLng2 = recentPlaceAppModel.j;
                    universalSearchDescriptiveLocationAppModel = new UniversalSearchDescriptiveLocationAppModel(str13, str2, str11, str12, latLng2);
                    i = WhenMappings.f5045a[((UniversalPickerViewState) this.this$0.f.getValue()).n.ordinal()];
                    if (i != 1) {
                        this.this$0.H0(latLng2, str2);
                        return unit;
                    }
                    if (i != 2) {
                        ChaloNavigationManager chaloNavigationManager2 = this.this$0.z;
                        Json json3 = ChaloJson.b;
                        json3.getClass();
                        chaloNavigationManager2.b(new ChaloNavigationRequest.Navigate(new TripPlannerArgs.ResultsScreen(null, json3.a(UniversalSearchDescriptiveLocationAppModel.INSTANCE.serializer(), universalSearchDescriptiveLocationAppModel)), null, null, 6));
                        return unit;
                    }
                    if (i == 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    universalPickerComponent = this.this$0;
                    str3 = universalPickerComponent.k.h;
                    if (str3 != null) {
                        Json json4 = ChaloJson.b;
                        json4.getClass();
                        universalPickerComponent.I0(str3, new UniversalSearchResultState(null, json4.a(RecentPlaceAppModel.INSTANCE.serializer(), recentPlaceAppModel), "NONE", null, 9));
                    }
                    return unit;
                }
                UniversalPickerComponent universalPickerComponent5 = this.this$0;
                kotlinToastManager3 = universalPickerComponent5.E;
                this.L$0 = kotlinToastManager3;
                this.label = 4;
                objB2 = universalPickerComponent5.t.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
                if (objB2 != coroutineSingletons) {
                    kotlinToastManager4 = kotlinToastManager3;
                    hq0.s(kotlinToastManager4, (String) objB2);
                    return unit;
                }
            }
        }
        return coroutineSingletons;
    }
}
