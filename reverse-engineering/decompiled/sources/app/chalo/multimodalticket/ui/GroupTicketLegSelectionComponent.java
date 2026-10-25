package app.chalo.multimodalticket.ui;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.constants.Source;
import app.chalo.contract.MetroBookingFlowType;
import app.chalo.contract.ProductBookingHelper;
import app.chalo.data.ProductBookingBranding;
import app.chalo.domain.InstantTicketStopPrefill;
import app.chalo.domain.ProductNavigationSource;
import app.chalo.domain.TicketPurchaseSceneResolverUseCase;
import app.chalo.livetracking.tripplanner.data.models.app.GroupTicketJourneyLeg;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel;
import app.chalo.login.LoginAuthGuard;
import app.chalo.multimodalticket.data.model.app.GroupTicketBusTripDetailsAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketCategoryFareDetailsAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketJourneyOverviewItemAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketLegsAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketMetroTripDetailsAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketSelectableStepAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketSelectableStepAppModelKt;
import app.chalo.multimodalticket.data.model.app.GroupTicketSelectableStepLegDetails;
import app.chalo.multimodalticket.domain.FetchGroupTicketBookingFareDetailsUseCase;
import app.chalo.multimodalticket.domain.NormalizeGroupTicketJourneyLegsUseCase;
import app.chalo.multimodalticket.ui.GroupTicketLegSelectionComponent;
import app.chalo.multimodalticket.ui.GroupTicketLegSelectionDataState;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.productbooking.common.data.models.app.ProductConfigCompleteDetailsAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigCompleteDetailsListAppModel;
import app.chalo.productbooking.common.domain.FetchCompleteProductConfigByIdWithLocalCacheUseCase;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.GroupTicketBookingLeg;
import app.chalo.scenes.args.GroupTicketBookingSummaryArgs;
import app.chalo.scenes.args.GroupTicketLegSelectionArgs;
import app.chalo.scenes.args.GroupTicketMetroLineOverview;
import app.chalo.scenes.args.GroupTicketPassengerDetail;
import app.chalo.scenes.args.GroupTicketStop;
import app.chalo.scenes.args.GroupTicketTripDetail;
import app.chalo.scenes.args.TicketPurchaseArgs;
import app.chalo.utils.ChaloUseCaseResult;
import com.arkivanov.decompose.ComponentContext;
import defpackage.e40;
import defpackage.n10;
import defpackage.q60;
import defpackage.r60;
import defpackage.z20;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent;", "Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionDataState;", "Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionViewState;", "Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionSideEffect;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GroupTicketLegSelectionComponent extends ChaloBaseStateMviComponent<GroupTicketLegSelectionIntent, GroupTicketLegSelectionDataState, GroupTicketLegSelectionViewState, GroupTicketLegSelectionSideEffect> {
    public final GroupTicketSelectionUIStateFactory k;
    public final NormalizeGroupTicketJourneyLegsUseCase l;
    public final FetchGroupTicketBookingFareDetailsUseCase m;
    public final FetchCompleteProductConfigByIdWithLocalCacheUseCase n;
    public final TicketPurchaseSceneResolverUseCase o;
    public final ProductBookingHelper p;
    public final ChaloNavigationManager q;
    public final KotlinToastManager r;
    public final StringProvider s;
    public final AnalyticsContract t;
    public final LoginAuthGuard u;
    public Job v;
    public Job w;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5930a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[MetroBookingFlowType.values().length];
            try {
                iArr[MetroBookingFlowType.ONDC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MetroBookingFlowType.DIRECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f5930a = iArr;
            int[] iArr2 = new int[GroupTicketJourneySelectionMode.values().length];
            try {
                iArr2[GroupTicketJourneySelectionMode.FullJourney.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[GroupTicketJourneySelectionMode.IndividualSteps.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            b = iArr2;
        }
    }

    public GroupTicketLegSelectionComponent(ComponentContext componentContext, GroupTicketLegSelectionArgs groupTicketLegSelectionArgs, GroupTicketSelectionUIStateFactory groupTicketSelectionUIStateFactory, NormalizeGroupTicketJourneyLegsUseCase normalizeGroupTicketJourneyLegsUseCase, FetchGroupTicketBookingFareDetailsUseCase fetchGroupTicketBookingFareDetailsUseCase, FetchCompleteProductConfigByIdWithLocalCacheUseCase fetchCompleteProductConfigByIdWithLocalCacheUseCase, TicketPurchaseSceneResolverUseCase ticketPurchaseSceneResolverUseCase, ProductBookingHelper productBookingHelper, ChaloNavigationManager chaloNavigationManager, KotlinToastManager kotlinToastManager, StringProvider stringProvider, AnalyticsContract analyticsContract, LoginAuthGuard loginAuthGuard) {
        super(componentContext);
        this.k = groupTicketSelectionUIStateFactory;
        this.l = normalizeGroupTicketJourneyLegsUseCase;
        this.m = fetchGroupTicketBookingFareDetailsUseCase;
        this.n = fetchCompleteProductConfigByIdWithLocalCacheUseCase;
        this.o = ticketPurchaseSceneResolverUseCase;
        this.p = productBookingHelper;
        this.q = chaloNavigationManager;
        this.r = kotlinToastManager;
        this.s = stringProvider;
        this.t = analyticsContract;
        this.u = loginAuthGuard;
        N0(new GroupTicketLegSelectionIntent.InitializationIntent(groupTicketLegSelectionArgs));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bb, code lost:
    
        if (r2 == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c8, code lost:
    
        if (r5.L0(r6, r0) == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ca, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F0(app.chalo.multimodalticket.ui.GroupTicketLegSelectionComponent r5, java.util.ArrayList r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.multimodalticket.ui.GroupTicketLegSelectionComponent.F0(app.chalo.multimodalticket.ui.GroupTicketLegSelectionComponent, java.util.ArrayList, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final Object G0(GroupTicketLegSelectionComponent groupTicketLegSelectionComponent, Continuation continuation) {
        Object objH0;
        Iterator it;
        GroupTicketTripDetail metro;
        TripPlannerLegAppModel tripPlannerLegAppModel;
        GroupTicketLegSelectionDataState groupTicketLegSelectionDataState = (GroupTicketLegSelectionDataState) groupTicketLegSelectionComponent.f.getValue();
        List listV0 = CollectionsKt.v0(new GroupTicketLegSelectionComponent$runDataChecksAndNavigateIfPossible$$inlined$sortedBy$1(), J0(groupTicketLegSelectionDataState));
        int i = 10;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(listV0, 10));
        Iterator it2 = listV0.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            int i2 = 0;
            Unit unit = Unit.f17538a;
            if (!zHasNext) {
                if (!arrayList.isEmpty()) {
                    String str = groupTicketLegSelectionDataState.d;
                    if (str.length() != 0) {
                        String str2 = groupTicketLegSelectionDataState.h;
                        if (!StringsKt.F(str2)) {
                            Collection collectionValues = groupTicketLegSelectionDataState.f.values();
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj : collectionValues) {
                                if (((GroupTicketPassengerSelectionDataState) obj).c > 0) {
                                    arrayList2.add(obj);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList(CollectionsKt.v(arrayList2, 10));
                            int size = arrayList2.size();
                            while (i2 < size) {
                                Object obj2 = arrayList2.get(i2);
                                i2++;
                                GroupTicketPassengerSelectionDataState groupTicketPassengerSelectionDataState = (GroupTicketPassengerSelectionDataState) obj2;
                                GroupTicketCategoryFareDetailsAppModel groupTicketCategoryFareDetailsAppModel = groupTicketPassengerSelectionDataState.f5947a;
                                arrayList3.add(new GroupTicketPassengerDetail(groupTicketCategoryFareDetailsAppModel.f5851a, groupTicketCategoryFareDetailsAppModel.b, groupTicketPassengerSelectionDataState.c));
                            }
                            if (!arrayList3.isEmpty()) {
                                objH0 = groupTicketLegSelectionComponent.H0(str, str2, arrayList, arrayList3, (ContinuationImpl) continuation);
                                if (objH0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    break;
                                }
                                return unit;
                            }
                            objH0 = groupTicketLegSelectionComponent.M0(StringEnum.ADD_AT_LEAST_ONE_CATEGORY_MSG, ToastLength.SHORT, (ContinuationImpl) continuation);
                            if (objH0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                                break;
                            }
                            return unit;
                        }
                        objH0 = groupTicketLegSelectionComponent.M0(StringEnum.SOMETHING_WENT_WRONG, ToastLength.SHORT, (ContinuationImpl) continuation);
                        if (objH0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                            break;
                        }
                        return unit;
                    }
                    objH0 = groupTicketLegSelectionComponent.M0(StringEnum.SOMETHING_WENT_WRONG, ToastLength.SHORT, (ContinuationImpl) continuation);
                    if (objH0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        break;
                    }
                    return unit;
                }
                objH0 = groupTicketLegSelectionComponent.M0(StringEnum.SOMETHING_WENT_WRONG, ToastLength.SHORT, (ContinuationImpl) continuation);
                if (objH0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                return unit;
            }
            GroupTicketSelectableStepAppModel groupTicketSelectableStepAppModel = (GroupTicketSelectableStepAppModel) it2.next();
            Intrinsics.i(groupTicketSelectableStepAppModel, "<this>");
            GroupTicketBookingLeg groupTicketBookingLeg = null;
            str = null;
            str = null;
            String str3 = null;
            try {
                GroupTicketLegsAppModel groupTicketLegsAppModelB = GroupTicketSelectableStepAppModelKt.b(groupTicketSelectableStepAppModel);
                GroupTicketSelectableStepLegDetails groupTicketSelectableStepLegDetails = groupTicketSelectableStepAppModel.c;
                GroupTicketSelectableStepLegDetails.Bus bus = groupTicketSelectableStepLegDetails instanceof GroupTicketSelectableStepLegDetails.Bus ? (GroupTicketSelectableStepLegDetails.Bus) groupTicketSelectableStepLegDetails : null;
                if (bus != null && (tripPlannerLegAppModel = bus.f5865a.d) != null) {
                    TripPlannerLegAppModel.Bus bus2 = tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Bus ? (TripPlannerLegAppModel.Bus) tripPlannerLegAppModel : null;
                    if (bus2 != null) {
                        str3 = bus2.q;
                    }
                }
                ProductBookingBranding brandingType = groupTicketSelectableStepAppModel.d;
                Intrinsics.i(brandingType, "brandingType");
                if (groupTicketLegsAppModelB instanceof GroupTicketLegsAppModel.GroupTicketBusLegsAppModel) {
                    GroupTicketBusTripDetailsAppModel groupTicketBusTripDetailsAppModel = ((GroupTicketLegsAppModel.GroupTicketBusLegsAppModel) groupTicketLegsAppModelB).c;
                    metro = new GroupTicketTripDetail.Bus(groupTicketBusTripDetailsAppModel.f5850a, str3, GroupTicketSelectableStepAppModelKt.a(groupTicketBusTripDetailsAppModel.b), GroupTicketSelectableStepAppModelKt.a(groupTicketBusTripDetailsAppModel.c));
                    it = it2;
                } else {
                    if (!(groupTicketLegsAppModelB instanceof GroupTicketLegsAppModel.GroupTicketMetroLegsAppModel)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    GroupTicketMetroTripDetailsAppModel groupTicketMetroTripDetailsAppModel = ((GroupTicketLegsAppModel.GroupTicketMetroLegsAppModel) groupTicketLegsAppModelB).c;
                    GroupTicketStop groupTicketStopA = GroupTicketSelectableStepAppModelKt.a(groupTicketMetroTripDetailsAppModel.f5863a);
                    GroupTicketStop groupTicketStopA2 = GroupTicketSelectableStepAppModelKt.a(groupTicketMetroTripDetailsAppModel.b);
                    ArrayList arrayList4 = groupTicketMetroTripDetailsAppModel.c;
                    ArrayList arrayList5 = new ArrayList(CollectionsKt.v(arrayList4, i));
                    int size2 = arrayList4.size();
                    while (i2 < size2) {
                        Object obj3 = arrayList4.get(i2);
                        int i3 = i2 + 1;
                        GroupTicketJourneyOverviewItemAppModel groupTicketJourneyOverviewItemAppModel = (GroupTicketJourneyOverviewItemAppModel) obj3;
                        String str4 = groupTicketJourneyOverviewItemAppModel.f5858a;
                        String str5 = groupTicketJourneyOverviewItemAppModel.b;
                        List list = groupTicketJourneyOverviewItemAppModel.c;
                        Iterator it3 = it2;
                        ArrayList arrayList6 = arrayList4;
                        ArrayList arrayList7 = new ArrayList(CollectionsKt.v(list, 10));
                        Iterator it4 = list.iterator();
                        while (it4.hasNext()) {
                            arrayList7.add(GroupTicketSelectableStepAppModelKt.a((StopAppModel) it4.next()));
                        }
                        arrayList5.add(new GroupTicketMetroLineOverview(str4, str5, arrayList7));
                        it2 = it3;
                        arrayList4 = arrayList6;
                        i2 = i3;
                    }
                    it = it2;
                    metro = new GroupTicketTripDetail.Metro(groupTicketStopA, groupTicketStopA2, arrayList5);
                }
                groupTicketBookingLeg = new GroupTicketBookingLeg(groupTicketLegsAppModelB.getF5862a(), groupTicketLegsAppModelB.getB(), groupTicketLegsAppModelB.getD(), metro, brandingType);
            } catch (Exception unused) {
                it = it2;
            }
            if (groupTicketBookingLeg == null) {
                objH0 = groupTicketLegSelectionComponent.M0(StringEnum.SOMETHING_WENT_WRONG, ToastLength.SHORT, (ContinuationImpl) continuation);
                if (objH0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                return unit;
            }
            arrayList.add(groupTicketBookingLeg);
            it2 = it;
            i = 10;
        }
        return objH0;
    }

    public static Map I0(GroupTicketLegSelectionComponent groupTicketLegSelectionComponent, GroupTicketLegSelectionDataState groupTicketLegSelectionDataState, List list) {
        String str;
        groupTicketLegSelectionComponent.getClass();
        int i = WhenMappings.b[groupTicketLegSelectionDataState.f5931a.ordinal()];
        if (i == 1) {
            str = "full journey";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "individual steps";
        }
        groupTicketLegSelectionComponent.getClass();
        List list2 = list;
        return MapsKt.i(new Pair("groupTicketJourneyType", str), new Pair("groupTicketSelectedSteps", CollectionsKt.O(list2, ",", null, null, new z20(22), 30)), new Pair("groupTicketSelectedStepsTypes", CollectionsKt.O(list2, ",", null, null, new z20(23), 30)));
    }

    public static ArrayList J0(GroupTicketLegSelectionDataState groupTicketLegSelectionDataState) {
        List listV0 = CollectionsKt.v0(new GroupTicketLegSelectionComponent$getFareEligibleStepList$$inlined$sortedBy$1(), groupTicketLegSelectionDataState.e.values());
        if (groupTicketLegSelectionDataState.f5931a != GroupTicketJourneySelectionMode.FullJourney) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listV0) {
                if (((GroupTicketSelectableStepDataState) obj).f5948a) {
                    arrayList.add(obj);
                }
            }
            listV0 = arrayList;
        }
        List list = listV0;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((GroupTicketSelectableStepDataState) it.next()).b);
        }
        return arrayList2;
    }

    public static Pair P0(GroupTicketSelectableStepAppModel groupTicketSelectableStepAppModel) {
        StopAppModel stopAppModel;
        TripPlannerLegAppModel.Metro metro;
        StopAppModel stopAppModel2;
        Pair pair;
        String strA;
        String strA2;
        Intrinsics.i(groupTicketSelectableStepAppModel, "<this>");
        GroupTicketSelectableStepLegDetails groupTicketSelectableStepLegDetails = groupTicketSelectableStepAppModel.c;
        if (groupTicketSelectableStepLegDetails instanceof GroupTicketSelectableStepLegDetails.Bus) {
            TripPlannerLegAppModel tripPlannerLegAppModel = ((GroupTicketSelectableStepLegDetails.Bus) groupTicketSelectableStepLegDetails).f5865a.d;
            TripPlannerLegAppModel.Bus bus = tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Bus ? (TripPlannerLegAppModel.Bus) tripPlannerLegAppModel : null;
            if (bus == null) {
                pair = null;
                break;
            }
            pair = new Pair(bus.s, bus.t);
        } else {
            if (!(groupTicketSelectableStepLegDetails instanceof GroupTicketSelectableStepLegDetails.Metro)) {
                throw new NoWhenBranchMatchedException();
            }
            ArrayList arrayList = ((GroupTicketSelectableStepLegDetails.Metro) groupTicketSelectableStepLegDetails).f5866a;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.v(arrayList, 10));
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    TripPlannerLegAppModel.Metro metro2 = (TripPlannerLegAppModel.Metro) CollectionsKt.H(arrayList2);
                    if (metro2 != null && (stopAppModel = metro2.s) != null && (metro = (TripPlannerLegAppModel.Metro) CollectionsKt.Q(arrayList2)) != null && (stopAppModel2 = metro.t) != null) {
                        pair = new Pair(stopAppModel, stopAppModel2);
                        break;
                    }
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                TripPlannerLegAppModel tripPlannerLegAppModel2 = ((GroupTicketJourneyLeg) obj).d;
                TripPlannerLegAppModel.Metro metro3 = tripPlannerLegAppModel2 instanceof TripPlannerLegAppModel.Metro ? (TripPlannerLegAppModel.Metro) tripPlannerLegAppModel2 : null;
                if (metro3 != null) {
                    arrayList2.add(metro3);
                }
                pair = null;
                break;
            }
        }
        if (pair != null) {
            StopAppModel stopAppModel3 = (StopAppModel) pair.getFirst();
            StopAppModel stopAppModel4 = (StopAppModel) pair.getSecond();
            try {
                Json json = ChaloJson.b;
                json.getClass();
                strA = json.a(StopAppModel.INSTANCE.serializer(), stopAppModel3);
            } catch (Exception unused) {
                strA = null;
            }
            if (strA != null) {
                try {
                    Json json2 = ChaloJson.b;
                    json2.getClass();
                    strA2 = json2.a(StopAppModel.INSTANCE.serializer(), stopAppModel4);
                } catch (Exception unused2) {
                    strA2 = null;
                }
                if (strA2 != null) {
                    return new Pair(strA, strA2);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    public static LinkedHashMap Q0(LinkedHashMap linkedHashMap, int i) {
        boolean z;
        if (i >= 0) {
            Iterator it = linkedHashMap.values().iterator();
            int i2 = 0;
            while (it.hasNext()) {
                i2 += ((GroupTicketPassengerSelectionDataState) it.next()).c;
            }
            if (i2 >= i) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.g(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            GroupTicketPassengerSelectionDataState groupTicketPassengerSelectionDataState = (GroupTicketPassengerSelectionDataState) entry.getValue();
            linkedHashMap2.put(key, GroupTicketPassengerSelectionDataState.a(groupTicketPassengerSelectionDataState, false, 0, groupTicketPassengerSelectionDataState.c < groupTicketPassengerSelectionDataState.f5947a.f && !z, false, 23));
        }
        return linkedHashMap2;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:44:0x0101 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x0102 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object H0(String str, String str2, ArrayList arrayList, ArrayList arrayList2, ContinuationImpl continuationImpl) {
        GroupTicketLegSelectionComponent$fetchProductConfigAndNavigateIfPossible$1 groupTicketLegSelectionComponent$fetchProductConfigAndNavigateIfPossible$1;
        List list;
        List list2;
        String str3;
        String str4;
        Object objM0;
        if (continuationImpl instanceof GroupTicketLegSelectionComponent$fetchProductConfigAndNavigateIfPossible$1) {
            groupTicketLegSelectionComponent$fetchProductConfigAndNavigateIfPossible$1 = (GroupTicketLegSelectionComponent$fetchProductConfigAndNavigateIfPossible$1) continuationImpl;
            int i = groupTicketLegSelectionComponent$fetchProductConfigAndNavigateIfPossible$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                groupTicketLegSelectionComponent$fetchProductConfigAndNavigateIfPossible$1.label = i - Integer.MIN_VALUE;
            } else {
                groupTicketLegSelectionComponent$fetchProductConfigAndNavigateIfPossible$1 = new GroupTicketLegSelectionComponent$fetchProductConfigAndNavigateIfPossible$1(this, continuationImpl);
            }
        } else {
            groupTicketLegSelectionComponent$fetchProductConfigAndNavigateIfPossible$1 = new GroupTicketLegSelectionComponent$fetchProductConfigAndNavigateIfPossible$1(this, continuationImpl);
        }
        Object objA = groupTicketLegSelectionComponent$fetchProductConfigAndNavigateIfPossible$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = groupTicketLegSelectionComponent$fetchProductConfigAndNavigateIfPossible$1.label;
        Object obj2 = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objA);
            String str5 = ((GroupTicketBookingLeg) CollectionsKt.F(arrayList)).d.getB().f9260a;
            String str6 = ((GroupTicketBookingLeg) CollectionsKt.P(arrayList)).d.getC().f9260a;
            groupTicketLegSelectionComponent$fetchProductConfigAndNavigateIfPossible$1.L$0 = str;
            groupTicketLegSelectionComponent$fetchProductConfigAndNavigateIfPossible$1.L$1 = str2;
            groupTicketLegSelectionComponent$fetchProductConfigAndNavigateIfPossible$1.L$2 = arrayList;
            groupTicketLegSelectionComponent$fetchProductConfigAndNavigateIfPossible$1.L$3 = arrayList2;
            groupTicketLegSelectionComponent$fetchProductConfigAndNavigateIfPossible$1.label = 1;
            objA = this.n.a(str, str5, str6, groupTicketLegSelectionComponent$fetchProductConfigAndNavigateIfPossible$1);
            if (objA != obj) {
                list = arrayList;
                list2 = arrayList2;
                str3 = str;
                str4 = str2;
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ResultKt.b(objA);
                return obj2;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
            return obj2;
        }
        List list3 = (List) groupTicketLegSelectionComponent$fetchProductConfigAndNavigateIfPossible$1.L$3;
        List list4 = (List) groupTicketLegSelectionComponent$fetchProductConfigAndNavigateIfPossible$1.L$2;
        String str7 = (String) groupTicketLegSelectionComponent$fetchProductConfigAndNavigateIfPossible$1.L$1;
        String str8 = (String) groupTicketLegSelectionComponent$fetchProductConfigAndNavigateIfPossible$1.L$0;
        ResultKt.b(objA);
        list2 = list3;
        list = list4;
        str4 = str7;
        str3 = str8;
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objA;
        JobKt.e(groupTicketLegSelectionComponent$fetchProductConfigAndNavigateIfPossible$1.getContext());
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            O0("gt product config fetch failed", null);
            StringEnum stringEnum = StringEnum.SOMETHING_WENT_WRONG;
            groupTicketLegSelectionComponent$fetchProductConfigAndNavigateIfPossible$1.L$0 = null;
            groupTicketLegSelectionComponent$fetchProductConfigAndNavigateIfPossible$1.L$1 = null;
            groupTicketLegSelectionComponent$fetchProductConfigAndNavigateIfPossible$1.L$2 = null;
            groupTicketLegSelectionComponent$fetchProductConfigAndNavigateIfPossible$1.L$3 = null;
            groupTicketLegSelectionComponent$fetchProductConfigAndNavigateIfPossible$1.label = 3;
            if (M0(stringEnum, ToastLength.SHORT, groupTicketLegSelectionComponent$fetchProductConfigAndNavigateIfPossible$1) == obj) {
                return obj;
            }
            return obj2;
        }
        ProductConfigCompleteDetailsAppModel productConfigCompleteDetailsAppModel = ((ProductConfigCompleteDetailsListAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).f8205a;
        groupTicketLegSelectionComponent$fetchProductConfigAndNavigateIfPossible$1.L$0 = null;
        groupTicketLegSelectionComponent$fetchProductConfigAndNavigateIfPossible$1.L$1 = null;
        groupTicketLegSelectionComponent$fetchProductConfigAndNavigateIfPossible$1.L$2 = null;
        groupTicketLegSelectionComponent$fetchProductConfigAndNavigateIfPossible$1.L$3 = null;
        groupTicketLegSelectionComponent$fetchProductConfigAndNavigateIfPossible$1.label = 2;
        String str9 = productConfigCompleteDetailsAppModel.g;
        if (str9 == null) {
            objM0 = M0(StringEnum.SOMETHING_WENT_WRONG, ToastLength.SHORT, groupTicketLegSelectionComponent$fetchProductConfigAndNavigateIfPossible$1);
            if (objM0 != obj) {
                objM0 = obj2;
            }
        } else {
            String str10 = !StringsKt.F(str9) ? str9 : null;
            if (str10 == null) {
                objM0 = M0(StringEnum.SOMETHING_WENT_WRONG, ToastLength.SHORT, groupTicketLegSelectionComponent$fetchProductConfigAndNavigateIfPossible$1);
                if (objM0 != obj) {
                }
            } else {
                ChaloNavigationManagerKt.e(this.q, new GroupTicketBookingSummaryArgs(str3, str4, list2, list, productConfigCompleteDetailsAppModel.f, str10), null, 6);
            }
            objM0 = obj2;
        }
        if (objM0 == obj) {
            return obj;
        }
        return obj2;
    }

    public final void K0() {
        Map map = ((GroupTicketLegSelectionDataState) this.f.getValue()).f;
        if (!map.isEmpty()) {
            E0(new r60(0, map));
        }
        E0(new z20(21));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object L0(GroupTicketSelectableStepAppModel groupTicketSelectableStepAppModel, ContinuationImpl continuationImpl) {
        GroupTicketLegSelectionComponent$navigateToSingleBusBookingFlow$1 groupTicketLegSelectionComponent$navigateToSingleBusBookingFlow$1;
        InstantTicketStopPrefill instantTicketStopPrefill;
        String str;
        if (continuationImpl instanceof GroupTicketLegSelectionComponent$navigateToSingleBusBookingFlow$1) {
            groupTicketLegSelectionComponent$navigateToSingleBusBookingFlow$1 = (GroupTicketLegSelectionComponent$navigateToSingleBusBookingFlow$1) continuationImpl;
            int i = groupTicketLegSelectionComponent$navigateToSingleBusBookingFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                groupTicketLegSelectionComponent$navigateToSingleBusBookingFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                groupTicketLegSelectionComponent$navigateToSingleBusBookingFlow$1 = new GroupTicketLegSelectionComponent$navigateToSingleBusBookingFlow$1(this, continuationImpl);
            }
        } else {
            groupTicketLegSelectionComponent$navigateToSingleBusBookingFlow$1 = new GroupTicketLegSelectionComponent$navigateToSingleBusBookingFlow$1(this, continuationImpl);
        }
        GroupTicketLegSelectionComponent$navigateToSingleBusBookingFlow$1 groupTicketLegSelectionComponent$navigateToSingleBusBookingFlow$2 = groupTicketLegSelectionComponent$navigateToSingleBusBookingFlow$1;
        Object objA = groupTicketLegSelectionComponent$navigateToSingleBusBookingFlow$2.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = groupTicketLegSelectionComponent$navigateToSingleBusBookingFlow$2.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objA);
            ProductNavigationSource productNavigationSource = ProductNavigationSource.GROUP_TICKET_LEG_SELECTION;
            Pair pairP0 = P0(groupTicketSelectableStepAppModel);
            if (pairP0 != null) {
                String str2 = (String) pairP0.getFirst();
                String str3 = (String) pairP0.getSecond();
                GroupTicketSelectableStepLegDetails groupTicketSelectableStepLegDetails = groupTicketSelectableStepAppModel.c;
                if (groupTicketSelectableStepLegDetails instanceof GroupTicketSelectableStepLegDetails.Bus) {
                    TripPlannerLegAppModel tripPlannerLegAppModel = ((GroupTicketSelectableStepLegDetails.Bus) groupTicketSelectableStepLegDetails).f5865a.d;
                    TripPlannerLegAppModel.Bus bus = tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Bus ? (TripPlannerLegAppModel.Bus) tripPlannerLegAppModel : null;
                    if (bus != null) {
                        str = bus.p;
                    }
                    instantTicketStopPrefill = new InstantTicketStopPrefill(str2, str3, str);
                } else if (!(groupTicketSelectableStepLegDetails instanceof GroupTicketSelectableStepLegDetails.Metro)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = null;
                instantTicketStopPrefill = new InstantTicketStopPrefill(str2, str3, str);
            } else {
                instantTicketStopPrefill = null;
            }
            groupTicketLegSelectionComponent$navigateToSingleBusBookingFlow$2.label = 1;
            objA = TicketPurchaseSceneResolverUseCase.a(this.o, productNavigationSource, null, instantTicketStopPrefill, groupTicketLegSelectionComponent$navigateToSingleBusBookingFlow$2, 2);
            if (objA != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
            return unit;
        }
        ResultKt.b(objA);
        TicketPurchaseArgs ticketPurchaseArgs = (TicketPurchaseArgs) objA;
        JobKt.e(groupTicketLegSelectionComponent$navigateToSingleBusBookingFlow$2.getContext());
        if (ticketPurchaseArgs != null) {
            ChaloNavigationManagerKt.e(this.q, ticketPurchaseArgs, null, 6);
            return unit;
        }
        StringEnum stringEnum = StringEnum.PRODUCT_NOT_AVAILABLE_FOR_PURCHASE;
        groupTicketLegSelectionComponent$navigateToSingleBusBookingFlow$2.label = 2;
        return M0(stringEnum, ToastLength.SHORT, groupTicketLegSelectionComponent$navigateToSingleBusBookingFlow$2) == obj ? obj : unit;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M0(StringEnum stringEnum, ToastLength toastLength, ContinuationImpl continuationImpl) {
        GroupTicketLegSelectionComponent$postToast$1 groupTicketLegSelectionComponent$postToast$1;
        KotlinToastManager kotlinToastManager;
        if (continuationImpl instanceof GroupTicketLegSelectionComponent$postToast$1) {
            groupTicketLegSelectionComponent$postToast$1 = (GroupTicketLegSelectionComponent$postToast$1) continuationImpl;
            int i = groupTicketLegSelectionComponent$postToast$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                groupTicketLegSelectionComponent$postToast$1.label = i - Integer.MIN_VALUE;
            } else {
                groupTicketLegSelectionComponent$postToast$1 = new GroupTicketLegSelectionComponent$postToast$1(this, continuationImpl);
            }
        } else {
            groupTicketLegSelectionComponent$postToast$1 = new GroupTicketLegSelectionComponent$postToast$1(this, continuationImpl);
        }
        Object objB = groupTicketLegSelectionComponent$postToast$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = groupTicketLegSelectionComponent$postToast$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            groupTicketLegSelectionComponent$postToast$1.L$0 = toastLength;
            KotlinToastManager kotlinToastManager2 = this.r;
            groupTicketLegSelectionComponent$postToast$1.L$1 = kotlinToastManager2;
            groupTicketLegSelectionComponent$postToast$1.label = 1;
            objB = this.s.b(stringEnum, new Object[0], groupTicketLegSelectionComponent$postToast$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            kotlinToastManager = kotlinToastManager2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager = (KotlinToastManager) groupTicketLegSelectionComponent$postToast$1.L$1;
            toastLength = (ToastLength) groupTicketLegSelectionComponent$postToast$1.L$0;
            ResultKt.b(objB);
        }
        KotlinToastManagerKt.a(kotlinToastManager, (String) objB, toastLength);
        return Unit.f17538a;
    }

    public final void N0(GroupTicketLegSelectionIntent intent) {
        GroupTicketPassengerSelectionDataState groupTicketPassengerSelectionDataState;
        GroupTicketPassengerSelectionDataState groupTicketPassengerSelectionDataState2;
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof GroupTicketLegSelectionIntent.InitializationIntent;
        ContextScope contextScope = this.j;
        if (z) {
            BuildersKt.d(contextScope, null, null, new GroupTicketLegSelectionComponent$handleInitializationIntent$1(((GroupTicketLegSelectionIntent.InitializationIntent) intent).f5932a, this, null), 3);
            return;
        }
        if (intent instanceof GroupTicketLegSelectionIntent.OnJourneySelectionModeSelected) {
            E0(new e40(((GroupTicketLegSelectionIntent.OnJourneySelectionModeSelected) intent).f5940a, 4));
            return;
        }
        if (intent.equals(GroupTicketLegSelectionIntent.OnDismissBottomSheetIntent.f5936a)) {
            O0("gt leg selection bs dismissed", null);
            K0();
            return;
        }
        boolean z2 = intent instanceof GroupTicketLegSelectionIntent.OnFareInfoToolTipDismissed;
        StateFlow stateFlow = this.f;
        if (z2) {
            String str = ((GroupTicketLegSelectionIntent.OnFareInfoToolTipDismissed) intent).f5938a;
            Map map = ((GroupTicketLegSelectionDataState) stateFlow.getValue()).f;
            if (map.isEmpty()) {
                return;
            }
            LinkedHashMap linkedHashMapU = MapsKt.u(map);
            GroupTicketPassengerSelectionDataState groupTicketPassengerSelectionDataState3 = (GroupTicketPassengerSelectionDataState) linkedHashMapU.get(str);
            if (groupTicketPassengerSelectionDataState3 != null) {
                linkedHashMapU.put(str, GroupTicketPassengerSelectionDataState.a(groupTicketPassengerSelectionDataState3, false, 0, false, false, 29));
                E0(new q60(linkedHashMapU, 0));
                return;
            }
            return;
        }
        if (intent instanceof GroupTicketLegSelectionIntent.OnIndividualStepSelected) {
            int i = ((GroupTicketLegSelectionIntent.OnIndividualStepSelected) intent).f5939a;
            Map map2 = ((GroupTicketLegSelectionDataState) stateFlow.getValue()).e;
            if (map2.isEmpty()) {
                return;
            }
            LinkedHashMap linkedHashMapU2 = MapsKt.u(map2);
            GroupTicketSelectableStepDataState groupTicketSelectableStepDataState = (GroupTicketSelectableStepDataState) linkedHashMapU2.get(Integer.valueOf(i));
            if (groupTicketSelectableStepDataState == null) {
                return;
            }
            Integer numValueOf = Integer.valueOf(i);
            boolean z3 = !groupTicketSelectableStepDataState.f5948a;
            GroupTicketSelectableStepAppModel selectableStepAppModel = groupTicketSelectableStepDataState.b;
            Intrinsics.i(selectableStepAppModel, "selectableStepAppModel");
            linkedHashMapU2.put(numValueOf, new GroupTicketSelectableStepDataState(z3, selectableStepAppModel));
            E0(new q60(linkedHashMapU2, 1));
            return;
        }
        if (intent instanceof GroupTicketLegSelectionIntent.OnFareInfoClicked) {
            E0(new n10(((GroupTicketLegSelectionIntent.OnFareInfoClicked) intent).f5937a, 7));
            return;
        }
        if (intent instanceof GroupTicketLegSelectionIntent.OnPassengerDecreaseCountClick) {
            String str2 = ((GroupTicketLegSelectionIntent.OnPassengerDecreaseCountClick) intent).f5941a;
            final GroupTicketLegSelectionDataState groupTicketLegSelectionDataState = (GroupTicketLegSelectionDataState) stateFlow.getValue();
            Map map3 = groupTicketLegSelectionDataState.f;
            if (map3.isEmpty() || (groupTicketPassengerSelectionDataState2 = (GroupTicketPassengerSelectionDataState) map3.get(str2)) == null || !groupTicketPassengerSelectionDataState2.e) {
                return;
            }
            int i2 = groupTicketPassengerSelectionDataState2.c;
            final LinkedHashMap linkedHashMapU3 = MapsKt.u(map3);
            GroupTicketPassengerSelectionDataState groupTicketPassengerSelectionDataStateA = GroupTicketPassengerSelectionDataState.a(groupTicketPassengerSelectionDataState2, false, i2 - 1, false, false, 27);
            linkedHashMapU3.put(str2, GroupTicketPassengerSelectionDataState.a(groupTicketPassengerSelectionDataStateA, false, 0, false, groupTicketPassengerSelectionDataStateA.c > groupTicketPassengerSelectionDataStateA.f5947a.e, 15));
            final int i3 = 1;
            E0(new Function1(this) { // from class: s60
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i3) {
                        case 0:
                            GroupTicketLegSelectionDataState it = (GroupTicketLegSelectionDataState) obj;
                            Intrinsics.i(it, "it");
                            return GroupTicketLegSelectionDataState.a(it, null, false, null, null, null, GroupTicketLegSelectionComponent.Q0(linkedHashMapU3, groupTicketLegSelectionDataState.g), 0, null, 223);
                        default:
                            GroupTicketLegSelectionDataState it2 = (GroupTicketLegSelectionDataState) obj;
                            Intrinsics.i(it2, "it");
                            return GroupTicketLegSelectionDataState.a(it2, null, false, null, null, null, GroupTicketLegSelectionComponent.Q0(linkedHashMapU3, groupTicketLegSelectionDataState.g), 0, null, 223);
                    }
                }
            });
            return;
        }
        if (intent instanceof GroupTicketLegSelectionIntent.OnPassengerIncreaseCountClick) {
            String str3 = ((GroupTicketLegSelectionIntent.OnPassengerIncreaseCountClick) intent).f5942a;
            final GroupTicketLegSelectionDataState groupTicketLegSelectionDataState2 = (GroupTicketLegSelectionDataState) stateFlow.getValue();
            Map map4 = groupTicketLegSelectionDataState2.f;
            if (map4.isEmpty() || (groupTicketPassengerSelectionDataState = (GroupTicketPassengerSelectionDataState) map4.get(str3)) == null || !groupTicketPassengerSelectionDataState.d) {
                return;
            }
            int i4 = groupTicketPassengerSelectionDataState.c;
            final LinkedHashMap linkedHashMapU4 = MapsKt.u(map4);
            GroupTicketPassengerSelectionDataState groupTicketPassengerSelectionDataStateA2 = GroupTicketPassengerSelectionDataState.a(groupTicketPassengerSelectionDataState, false, i4 + 1, false, false, 27);
            linkedHashMapU4.put(str3, GroupTicketPassengerSelectionDataState.a(groupTicketPassengerSelectionDataStateA2, false, 0, false, groupTicketPassengerSelectionDataStateA2.c > groupTicketPassengerSelectionDataStateA2.f5947a.e, 15));
            final int i5 = 0;
            E0(new Function1(this) { // from class: s60
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i5) {
                        case 0:
                            GroupTicketLegSelectionDataState it = (GroupTicketLegSelectionDataState) obj;
                            Intrinsics.i(it, "it");
                            return GroupTicketLegSelectionDataState.a(it, null, false, null, null, null, GroupTicketLegSelectionComponent.Q0(linkedHashMapU4, groupTicketLegSelectionDataState2.g), 0, null, 223);
                        default:
                            GroupTicketLegSelectionDataState it2 = (GroupTicketLegSelectionDataState) obj;
                            Intrinsics.i(it2, "it");
                            return GroupTicketLegSelectionDataState.a(it2, null, false, null, null, null, GroupTicketLegSelectionComponent.Q0(linkedHashMapU4, groupTicketLegSelectionDataState2.g), 0, null, 223);
                    }
                }
            });
            return;
        }
        if (intent.equals(GroupTicketLegSelectionIntent.OnBackNavIconClickedIntent.f5933a)) {
            O0("gt leg selection back nav clicked", null);
            ChaloNavigationManagerKt.c(this.q);
            return;
        }
        if (intent.equals(GroupTicketLegSelectionIntent.OnContinueBtnClickedIntent.f5935a)) {
            O0("gt leg selection proceed btn clicked", null);
            Job job = this.v;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            this.v = BuildersKt.d(contextScope, null, null, new GroupTicketLegSelectionComponent$fetchFareDetails$1(this, null), 3);
            return;
        }
        if (intent.equals(GroupTicketLegSelectionIntent.OnProceedBtnClickedIntent.f5943a)) {
            O0("gt leg selection proceed btn clicked", null);
            Job job2 = this.w;
            if (job2 != null) {
                ((JobSupport) job2).cancel(null);
            }
            this.w = BuildersKt.d(contextScope, null, null, new GroupTicketLegSelectionComponent$handleOnProceedBtnClickedIntent$1(this, null), 3);
            return;
        }
        if (!intent.equals(GroupTicketLegSelectionIntent.OnTryAgainBtnClickedIntent.f5944a)) {
            if (!intent.equals(GroupTicketLegSelectionIntent.OnBottomSheetCancelBtnClickedIntent.f5934a)) {
                throw new NoWhenBranchMatchedException();
            }
            O0("gt leg selection bs cancel btn clicked", null);
            K0();
            return;
        }
        O0("gt leg selection try again btn clicked", null);
        K0();
        Job job3 = this.v;
        if (job3 != null) {
            ((JobSupport) job3).cancel(null);
        }
        this.v = BuildersKt.d(contextScope, null, null, new GroupTicketLegSelectionComponent$fetchFareDetails$1(this, null), 3);
    }

    public final void O0(String str, Map map) {
        AnalyticsContractImplKt.b(this.t, str, Source.GROUP_TICKET_LEG_SELECTION_SCREEN, map, false, 24);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        GroupTicketLegSelectionComponent$convertToUiState$2 groupTicketLegSelectionComponent$convertToUiState$2 = new GroupTicketLegSelectionComponent$convertToUiState$2(1, this, GroupTicketLegSelectionComponent.class, "processIntent", "processIntent(Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent;)V", 0);
        return this.k.a((GroupTicketLegSelectionDataState) obj, groupTicketLegSelectionComponent$convertToUiState$2, continuationImpl);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new GroupTicketLegSelectionDataState(GroupTicketJourneySelectionMode.FullJourney, false, GroupTicketLegSelectionBottomSheetDataStateType.None.f5928a, "", MapsKt.d(), MapsKt.d(), Integer.MAX_VALUE, "");
    }
}
