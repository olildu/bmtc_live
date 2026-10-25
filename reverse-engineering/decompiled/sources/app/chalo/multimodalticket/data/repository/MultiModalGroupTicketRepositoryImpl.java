package app.chalo.multimodalticket.data.repository;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.data.ClusterConfig;
import app.chalo.domain.GetClusterConfigForCityUseCase;
import app.chalo.extensions.AnyExtsKt;
import app.chalo.instantticket.data.exception.InvalidFareResponseDataException;
import app.chalo.instantticket.data.model.api.response.FetchMobileTicketFareResponseApiModelKt;
import app.chalo.instantticket.data.model.app.response.FareBreakupAppModel;
import app.chalo.instantticket.data.model.app.response.FareBreakupOperationType;
import app.chalo.models.ordercreation.CreateOrderResponseApiModel;
import app.chalo.models.ordercreation.CreateOrderResponseApiModelKt;
import app.chalo.multimodalticket.data.local.MultiModalGroupTicketLocalDataSource;
import app.chalo.multimodalticket.data.model.api.GroupTicketBookingFareRequestApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketBookingFareResponseApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketBusTripDetailsApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketCategoriesApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketCreateOrderLegApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketCreateOrderMetroLineOverviewApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketCreateOrderPassengerDetailApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketCreateOrderRequestApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketCreateOrderStopApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketCreateOrderTripDetailApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketJourneyOverviewItemApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketLegApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketLegBreakupApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketLegFareDetailApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketMetroTripDetailsApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketStopDetailsApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketSummaryLegApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketSummaryMetroLineOverviewApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketSummaryPassengerDetailApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketSummaryRequestApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketSummaryResponseApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketSummaryStopApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketSummaryTripDetailApiModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketBookingFareRequestAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketBookingFareRequestAppModelKt;
import app.chalo.multimodalticket.data.model.app.GroupTicketBookingFareResponseAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketBusTripDetailsAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketCategoryFareDetailsAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketCreateOrderLegAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketCreateOrderMetroLineOverviewAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketCreateOrderPassengerDetailAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketCreateOrderRequestAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketCreateOrderStopAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketCreateOrderTripDetailAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketJourneyOverviewItemAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketLegBreakupFareDetailsAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketLegFareDetailAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketLegsAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketMetroTripDetailsAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketSummaryLegAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketSummaryMetroLineOverviewAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketSummaryPassengerDetailAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketSummaryRequestAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketSummaryResponseAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketSummaryResponseAppModelKt;
import app.chalo.multimodalticket.data.model.app.GroupTicketSummaryStopAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketSummaryTripDetailAppModel;
import app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketAppModel;
import app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketAppModelToEntityMapperKt;
import app.chalo.multimodalticket.data.remote.MultiModalGroupTicketRemoteDataSource;
import app.chalo.multimodalticket.domain.MultiModalGroupTicketEntityToAppModelConverter;
import app.chalo.multimodalticket.domain.MultiModalGroupTicketEntityToAppModelConverter$convert$$inlined$flatMapLatest$1;
import app.chalo.multimodalticket.domain.MultiModalGroupTicketEntityToAppModelConverter$convertAll$$inlined$flatMapLatest$1;
import app.chalo.multimodalticket.error.MultiModalGroupTicketSummaryInvalidResponseException;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketFareBreakupApiResponseModel;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/data/repository/MultiModalGroupTicketRepositoryImpl;", "Lapp/chalo/multimodalticket/data/repository/MultiModalGroupTicketRepository;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MultiModalGroupTicketRepositoryImpl implements MultiModalGroupTicketRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultiModalGroupTicketRemoteDataSource f5880a;
    public final MultiModalGroupTicketLocalDataSource b;
    public final MultiModalGroupTicketEntityToAppModelConverter c;
    public final UserProfileDetailsProvider d;
    public final CityProvider e;
    public final GetClusterConfigForCityUseCase f;

    public MultiModalGroupTicketRepositoryImpl(MultiModalGroupTicketRemoteDataSource multiModalGroupTicketRemoteDataSource, MultiModalGroupTicketLocalDataSource multiModalGroupTicketLocalDataSource, MultiModalGroupTicketEntityToAppModelConverter multiModalGroupTicketEntityToAppModelConverter, UserProfileDetailsProvider userProfileDetailsProvider, CityProvider cityProvider, GetClusterConfigForCityUseCase getClusterConfigForCityUseCase) {
        this.f5880a = multiModalGroupTicketRemoteDataSource;
        this.b = multiModalGroupTicketLocalDataSource;
        this.c = multiModalGroupTicketEntityToAppModelConverter;
        this.d = userProfileDetailsProvider;
        this.e = cityProvider;
        this.f = getClusterConfigForCityUseCase;
    }

    public static boolean k(String str, String str2, String str3, List list) {
        if (!Intrinsics.d(str, str3)) {
            return false;
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (StringsKt.x((String) it.next(), str2, true)) {
                return true;
            }
        }
        return false;
    }

    @Override // app.chalo.multimodalticket.data.repository.MultiModalGroupTicketRepository
    public final Flow a(String subTicketId, String str) {
        Intrinsics.i(subTicketId, "subTicketId");
        return this.b.a(subTicketId, str);
    }

    @Override // app.chalo.multimodalticket.data.repository.MultiModalGroupTicketRepository
    public final Flow b() {
        return this.b.b();
    }

    @Override // app.chalo.multimodalticket.data.repository.MultiModalGroupTicketRepository
    public final ChannelFlowTransformLatest c(String groupId) {
        Intrinsics.i(groupId, "groupId");
        Flow entityFlow = this.b.c(groupId);
        Intrinsics.i(entityFlow, "entityFlow");
        return FlowKt.H(entityFlow, new MultiModalGroupTicketEntityToAppModelConverter$convert$$inlined$flatMapLatest$1(null, this.c));
    }

    @Override // app.chalo.multimodalticket.data.repository.MultiModalGroupTicketRepository
    public final Object d(Continuation continuation) {
        Object objD = this.b.d(continuation);
        return objD == CoroutineSingletons.COROUTINE_SUSPENDED ? objD : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:141:0x0326  */
    /* JADX WARN: Code duplicated, block: B:146:0x0340  */
    /* JADX WARN: Code duplicated, block: B:150:0x0354  */
    /* JADX WARN: Code duplicated, block: B:153:0x035b  */
    /* JADX WARN: Code duplicated, block: B:155:0x035f  */
    /* JADX WARN: Code duplicated, block: B:156:0x0364  */
    /* JADX WARN: Code duplicated, block: B:160:0x037c  */
    /* JADX WARN: Code duplicated, block: B:162:0x0384  */
    /* JADX WARN: Code duplicated, block: B:164:0x038a  */
    /* JADX WARN: Code duplicated, block: B:167:0x0391  */
    /* JADX WARN: Code duplicated, block: B:169:0x0395  */
    /* JADX WARN: Code duplicated, block: B:170:0x039a  */
    /* JADX WARN: Code duplicated, block: B:173:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:176:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:178:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:179:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:181:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:182:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:193:0x0402  */
    /* JADX WARN: Code duplicated, block: B:199:0x041f A[LOOP:5: B:198:0x041d->B:199:0x041f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:203:0x0432  */
    /* JADX WARN: Code duplicated, block: B:211:0x0342 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0329 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x0415 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x0411 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0404 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:66:0x01f1 A[LOOP:0: B:64:0x01eb->B:66:0x01f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x020b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0222  */
    /* JADX WARN: Code duplicated, block: B:74:0x022c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0240  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x024a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0257  */
    /* JADX WARN: Code duplicated, block: B:83:0x025a  */
    /* JADX WARN: Code duplicated, block: B:92:0x026f  */
    @Override // app.chalo.multimodalticket.data.repository.MultiModalGroupTicketRepository
    public final Object e(GroupTicketBookingFareRequestAppModel groupTicketBookingFareRequestAppModel, ContinuationImpl continuationImpl) throws InvalidFareResponseDataException {
        MultiModalGroupTicketRepositoryImpl$getTicketBookingFareDetails$1 multiModalGroupTicketRepositoryImpl$getTicketBookingFareDetails$1;
        String str;
        int i;
        Object groupTicketMetroLegApiModel;
        MultiModalGroupTicketRepositoryImpl$getTicketBookingFareDetails$1 multiModalGroupTicketRepositoryImpl$getTicketBookingFareDetails$2;
        CoroutineSingletons coroutineSingletons;
        GroupTicketBookingFareResponseAppModel groupTicketBookingFareResponseAppModel;
        GroupTicketBookingFareResponseAppModel groupTicketBookingFareResponseAppModel2;
        List list;
        Long l;
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        Iterator it2;
        Integer num;
        int iIntValue;
        ArrayList arrayList3;
        Iterator it3;
        int i2;
        int size;
        int i3;
        long j;
        Object next;
        int i4;
        GroupTicketCategoriesApiModel groupTicketCategoriesApiModel;
        Integer num2;
        int iIntValue2;
        Integer num3;
        int iIntValue3;
        Pair pair;
        int iIntValue4;
        int iIntValue5;
        String str2;
        String str3;
        Long l2;
        List list2;
        List<GroupTicketLegBreakupApiModel> list3;
        ArrayList arrayList4;
        String str4;
        List list4;
        GroupTicketLegBreakupFareDetailsAppModel groupTicketLegBreakupFareDetailsAppModel;
        GroupTicketLegBreakupFareDetailsAppModel groupTicketLegBreakupFareDetailsAppModel2;
        ChaloTransitMode chaloTransitMode;
        ChaloTransitMode chaloTransitModeA;
        ChaloTransitMode chaloTransitMode2;
        List<GenericMobileTicketFareBreakupApiResponseModel> list5;
        List list6;
        FareBreakupAppModel fareBreakupAppModel;
        FareBreakupOperationType fareBreakupOperationTypeA;
        if (continuationImpl instanceof MultiModalGroupTicketRepositoryImpl$getTicketBookingFareDetails$1) {
            multiModalGroupTicketRepositoryImpl$getTicketBookingFareDetails$1 = (MultiModalGroupTicketRepositoryImpl$getTicketBookingFareDetails$1) continuationImpl;
            int i5 = multiModalGroupTicketRepositoryImpl$getTicketBookingFareDetails$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                multiModalGroupTicketRepositoryImpl$getTicketBookingFareDetails$1.label = i5 - Integer.MIN_VALUE;
            } else {
                multiModalGroupTicketRepositoryImpl$getTicketBookingFareDetails$1 = new MultiModalGroupTicketRepositoryImpl$getTicketBookingFareDetails$1(this, continuationImpl);
            }
        } else {
            multiModalGroupTicketRepositoryImpl$getTicketBookingFareDetails$1 = new MultiModalGroupTicketRepositoryImpl$getTicketBookingFareDetails$1(this, continuationImpl);
        }
        Object objA = multiModalGroupTicketRepositoryImpl$getTicketBookingFareDetails$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = multiModalGroupTicketRepositoryImpl$getTicketBookingFareDetails$1.label;
        String str5 = "<this>";
        if (i6 == 0) {
            ResultKt.b(objA);
            Intrinsics.i(groupTicketBookingFareRequestAppModel, "<this>");
            String str6 = groupTicketBookingFareRequestAppModel.f5848a;
            String str7 = groupTicketBookingFareRequestAppModel.b;
            ArrayList arrayList5 = groupTicketBookingFareRequestAppModel.c;
            ArrayList arrayList6 = new ArrayList(CollectionsKt.v(arrayList5, 10));
            int size2 = arrayList5.size();
            int i7 = 0;
            while (i7 < size2) {
                Object obj = arrayList5.get(i7);
                int i8 = i7 + 1;
                GroupTicketLegsAppModel groupTicketLegsAppModel = (GroupTicketLegsAppModel) obj;
                Intrinsics.i(groupTicketLegsAppModel, str5);
                if (groupTicketLegsAppModel instanceof GroupTicketLegsAppModel.GroupTicketBusLegsAppModel) {
                    GroupTicketLegsAppModel.GroupTicketBusLegsAppModel groupTicketBusLegsAppModel = (GroupTicketLegsAppModel.GroupTicketBusLegsAppModel) groupTicketLegsAppModel;
                    int i9 = groupTicketBusLegsAppModel.f5861a;
                    String str8 = groupTicketBusLegsAppModel.b;
                    String mode = groupTicketBusLegsAppModel.d.getMode();
                    GroupTicketBusTripDetailsAppModel groupTicketBusTripDetailsAppModel = groupTicketBusLegsAppModel.c;
                    groupTicketMetroLegApiModel = new GroupTicketLegApiModel.GroupTicketBusLegApiModel(i9, str8, mode, new GroupTicketBusTripDetailsApiModel(groupTicketBusTripDetailsAppModel.f5850a, GroupTicketBookingFareRequestAppModelKt.a(groupTicketBusTripDetailsAppModel.b), GroupTicketBookingFareRequestAppModelKt.a(groupTicketBusTripDetailsAppModel.c)));
                    multiModalGroupTicketRepositoryImpl$getTicketBookingFareDetails$2 = multiModalGroupTicketRepositoryImpl$getTicketBookingFareDetails$1;
                    coroutineSingletons = coroutineSingletons2;
                } else {
                    if (!(groupTicketLegsAppModel instanceof GroupTicketLegsAppModel.GroupTicketMetroLegsAppModel)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    GroupTicketLegsAppModel.GroupTicketMetroLegsAppModel groupTicketMetroLegsAppModel = (GroupTicketLegsAppModel.GroupTicketMetroLegsAppModel) groupTicketLegsAppModel;
                    int i10 = groupTicketMetroLegsAppModel.f5862a;
                    String str9 = groupTicketMetroLegsAppModel.b;
                    String mode2 = groupTicketMetroLegsAppModel.d.getMode();
                    GroupTicketMetroTripDetailsAppModel groupTicketMetroTripDetailsAppModel = groupTicketMetroLegsAppModel.c;
                    GroupTicketStopDetailsApiModel groupTicketStopDetailsApiModelA = GroupTicketBookingFareRequestAppModelKt.a(groupTicketMetroTripDetailsAppModel.f5863a);
                    GroupTicketStopDetailsApiModel groupTicketStopDetailsApiModelA2 = GroupTicketBookingFareRequestAppModelKt.a(groupTicketMetroTripDetailsAppModel.b);
                    ArrayList arrayList7 = groupTicketMetroTripDetailsAppModel.c;
                    ArrayList arrayList8 = new ArrayList(CollectionsKt.v(arrayList7, 10));
                    int size3 = arrayList7.size();
                    int i11 = 0;
                    while (i11 < size3) {
                        Object obj2 = arrayList7.get(i11);
                        int i12 = i11 + 1;
                        int i13 = size3;
                        GroupTicketJourneyOverviewItemAppModel groupTicketJourneyOverviewItemAppModel = (GroupTicketJourneyOverviewItemAppModel) obj2;
                        ArrayList arrayList9 = arrayList7;
                        String str10 = groupTicketJourneyOverviewItemAppModel.f5858a;
                        String str11 = groupTicketJourneyOverviewItemAppModel.b;
                        List list7 = groupTicketJourneyOverviewItemAppModel.c;
                        CoroutineSingletons coroutineSingletons3 = coroutineSingletons2;
                        MultiModalGroupTicketRepositoryImpl$getTicketBookingFareDetails$1 multiModalGroupTicketRepositoryImpl$getTicketBookingFareDetails$3 = multiModalGroupTicketRepositoryImpl$getTicketBookingFareDetails$1;
                        ArrayList arrayList10 = new ArrayList(CollectionsKt.v(list7, 10));
                        Iterator it4 = list7.iterator();
                        while (it4.hasNext()) {
                            arrayList10.add(GroupTicketBookingFareRequestAppModelKt.a((StopAppModel) it4.next()));
                        }
                        arrayList8.add(new GroupTicketJourneyOverviewItemApiModel(str10, str11, arrayList10));
                        arrayList7 = arrayList9;
                        size3 = i13;
                        i11 = i12;
                        coroutineSingletons2 = coroutineSingletons3;
                        multiModalGroupTicketRepositoryImpl$getTicketBookingFareDetails$1 = multiModalGroupTicketRepositoryImpl$getTicketBookingFareDetails$3;
                    }
                    multiModalGroupTicketRepositoryImpl$getTicketBookingFareDetails$2 = multiModalGroupTicketRepositoryImpl$getTicketBookingFareDetails$1;
                    coroutineSingletons = coroutineSingletons2;
                    groupTicketMetroLegApiModel = new GroupTicketLegApiModel.GroupTicketMetroLegApiModel(i10, str9, mode2, new GroupTicketMetroTripDetailsApiModel(groupTicketStopDetailsApiModelA, groupTicketStopDetailsApiModelA2, arrayList8));
                }
                arrayList6.add(groupTicketMetroLegApiModel);
                arrayList5 = arrayList5;
                size2 = size2;
                i7 = i8;
                str5 = str5;
                coroutineSingletons2 = coroutineSingletons;
                multiModalGroupTicketRepositoryImpl$getTicketBookingFareDetails$1 = multiModalGroupTicketRepositoryImpl$getTicketBookingFareDetails$2;
            }
            CoroutineSingletons coroutineSingletons4 = coroutineSingletons2;
            str = str5;
            i = 0;
            GroupTicketBookingFareRequestApiModel groupTicketBookingFareRequestApiModel = new GroupTicketBookingFareRequestApiModel(str6, str7, arrayList6);
            multiModalGroupTicketRepositoryImpl$getTicketBookingFareDetails$1.label = 1;
            objA = this.f5880a.a(groupTicketBookingFareRequestApiModel, multiModalGroupTicketRepositoryImpl$getTicketBookingFareDetails$1);
            if (objA == coroutineSingletons4) {
                return coroutineSingletons4;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
            str = "<this>";
            i = 0;
        }
        GroupTicketBookingFareResponseApiModel groupTicketBookingFareResponseApiModel = (GroupTicketBookingFareResponseApiModel) objA;
        Intrinsics.i(groupTicketBookingFareResponseApiModel, str);
        List list8 = groupTicketBookingFareResponseApiModel.c;
        String str12 = groupTicketBookingFareResponseApiModel.f5802a;
        if (str12 == null || StringsKt.F(str12) || (list = list8) == null || list.isEmpty()) {
            groupTicketBookingFareResponseAppModel = null;
            groupTicketBookingFareResponseAppModel2 = groupTicketBookingFareResponseAppModel;
        } else {
            List list9 = list8;
            if ((list9 instanceof Collection) && list9.isEmpty()) {
                arrayList = new ArrayList(CollectionsKt.v(list9, 10));
                it = list9.iterator();
                while (it.hasNext()) {
                    arrayList.add(((GroupTicketCategoriesApiModel) it.next()).f5806a);
                }
                if (CollectionsKt.z(arrayList).size() == list8.size()) {
                    List list10 = list8;
                    arrayList2 = new ArrayList(CollectionsKt.v(list10, 10));
                    it2 = list10.iterator();
                    while (it2.hasNext()) {
                        list3 = ((GroupTicketCategoriesApiModel) it2.next()).g;
                        if (list3 == null) {
                            list3 = EmptyList.f17557a;
                        }
                        arrayList4 = new ArrayList();
                        for (GroupTicketLegBreakupApiModel groupTicketLegBreakupApiModel : list3) {
                            str4 = groupTicketLegBreakupApiModel.b;
                            if (str4 != null) {
                                ChaloTransitMode.Companion companion = ChaloTransitMode.INSTANCE;
                                chaloTransitMode = ChaloTransitMode.UNKNOWN;
                                companion.getClass();
                                chaloTransitModeA = ChaloTransitMode.Companion.a(str4, chaloTransitMode);
                                if (chaloTransitModeA != chaloTransitMode) {
                                    chaloTransitMode2 = chaloTransitModeA;
                                } else {
                                    chaloTransitMode2 = null;
                                }
                                if (chaloTransitMode2 != null) {
                                    list4 = list3;
                                    groupTicketLegBreakupFareDetailsAppModel = null;
                                    groupTicketLegBreakupFareDetailsAppModel2 = groupTicketLegBreakupFareDetailsAppModel;
                                } else {
                                    list4 = list3;
                                    groupTicketLegBreakupFareDetailsAppModel = null;
                                    groupTicketLegBreakupFareDetailsAppModel2 = groupTicketLegBreakupFareDetailsAppModel;
                                }
                            } else {
                                list4 = list3;
                                groupTicketLegBreakupFareDetailsAppModel = null;
                                groupTicketLegBreakupFareDetailsAppModel2 = groupTicketLegBreakupFareDetailsAppModel;
                            }
                            if (groupTicketLegBreakupFareDetailsAppModel2 != null) {
                                arrayList4.add(groupTicketLegBreakupFareDetailsAppModel2);
                            }
                            list3 = list4;
                        }
                        if (arrayList4.size() == list3.size()) {
                            arrayList4 = null;
                        }
                        arrayList2.add(arrayList4);
                    }
                    groupTicketBookingFareResponseAppModel = null;
                    num = groupTicketBookingFareResponseApiModel.b;
                    if (num == null) {
                        iIntValue = Integer.MAX_VALUE;
                    } else {
                        if (num.intValue() < 0) {
                            num = null;
                        }
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = Integer.MAX_VALUE;
                        }
                    }
                    arrayList3 = new ArrayList(CollectionsKt.v(list10, 10));
                    it3 = list10.iterator();
                    i2 = i;
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            i4 = i2 + 1;
                            if (i2 >= 0) {
                                CollectionsKt.z0();
                                throw null;
                            }
                            groupTicketCategoriesApiModel = (GroupTicketCategoriesApiModel) next;
                            num2 = groupTicketCategoriesApiModel.e;
                            if (num2 == null) {
                                iIntValue2 = i;
                            } else {
                                if (num2.intValue() < 0) {
                                    num2 = null;
                                }
                                if (num2 != null) {
                                    iIntValue2 = num2.intValue();
                                } else {
                                    iIntValue2 = i;
                                }
                            }
                            num3 = groupTicketCategoriesApiModel.f;
                            if (num3 == null) {
                                iIntValue3 = Integer.MAX_VALUE;
                            } else {
                                if (num3.intValue() < 0) {
                                    num3 = null;
                                }
                                if (num3 != null) {
                                    iIntValue3 = num3.intValue();
                                } else {
                                    iIntValue3 = Integer.MAX_VALUE;
                                }
                            }
                            if (iIntValue2 > iIntValue3) {
                                pair = new Pair(Integer.valueOf(i), Integer.MAX_VALUE);
                            } else {
                                pair = new Pair(Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3));
                            }
                            iIntValue4 = ((Number) pair.getFirst()).intValue();
                            iIntValue5 = ((Number) pair.getSecond()).intValue();
                            str2 = groupTicketCategoriesApiModel.f5806a;
                            if (str2 != null) {
                                break;
                            }
                            long jLongValue = l2.longValue();
                            Long l3 = groupTicketCategoriesApiModel.d;
                            list2 = (List) arrayList2.get(i2);
                            if (list2 == null) {
                                list2 = EmptyList.f17557a;
                            }
                            arrayList3.add(new GroupTicketCategoryFareDetailsAppModel(str2, str3, jLongValue, l3, iIntValue4, iIntValue5, list2));
                            i2 = i4;
                        } else {
                            size = arrayList3.size();
                            i3 = i;
                            j = 0;
                            while (i3 < size) {
                                Object obj3 = arrayList3.get(i3);
                                i3++;
                                j += (long) ((GroupTicketCategoryFareDetailsAppModel) obj3).e;
                            }
                            if (j > iIntValue) {
                                break;
                            }
                            groupTicketBookingFareResponseAppModel2 = new GroupTicketBookingFareResponseAppModel(iIntValue, str12, arrayList3);
                        }
                    }
                } else {
                    groupTicketBookingFareResponseAppModel = null;
                }
                groupTicketBookingFareResponseAppModel2 = groupTicketBookingFareResponseAppModel;
            } else {
                Iterator it5 = list9.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        GroupTicketCategoriesApiModel groupTicketCategoriesApiModel2 = (GroupTicketCategoriesApiModel) it5.next();
                        if (!AnyExtsKt.a(groupTicketCategoriesApiModel2.f5806a) || !AnyExtsKt.a(groupTicketCategoriesApiModel2.b) || (l = groupTicketCategoriesApiModel2.c) == null || l.longValue() < 0) {
                        }
                    } else {
                        arrayList = new ArrayList(CollectionsKt.v(list9, 10));
                        it = list9.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((GroupTicketCategoriesApiModel) it.next()).f5806a);
                        }
                        if (CollectionsKt.z(arrayList).size() == list8.size()) {
                            List list11 = list8;
                            arrayList2 = new ArrayList(CollectionsKt.v(list11, 10));
                            it2 = list11.iterator();
                            while (it2.hasNext()) {
                                list3 = ((GroupTicketCategoriesApiModel) it2.next()).g;
                                if (list3 == null) {
                                    list3 = EmptyList.f17557a;
                                }
                                arrayList4 = new ArrayList();
                                while (r10.hasNext()) {
                                    str4 = groupTicketLegBreakupApiModel.b;
                                    if (str4 != null) {
                                        ChaloTransitMode.Companion companion2 = ChaloTransitMode.INSTANCE;
                                        chaloTransitMode = ChaloTransitMode.UNKNOWN;
                                        companion2.getClass();
                                        chaloTransitModeA = ChaloTransitMode.Companion.a(str4, chaloTransitMode);
                                        if (chaloTransitModeA != chaloTransitMode) {
                                            chaloTransitMode2 = chaloTransitModeA;
                                        } else {
                                            chaloTransitMode2 = null;
                                        }
                                        if (chaloTransitMode2 != null || (list5 = groupTicketLegBreakupApiModel.g) == null) {
                                            list4 = list3;
                                            groupTicketLegBreakupFareDetailsAppModel = null;
                                            groupTicketLegBreakupFareDetailsAppModel2 = groupTicketLegBreakupFareDetailsAppModel;
                                        } else {
                                            if (list5.isEmpty()) {
                                                list5 = null;
                                            }
                                            if (list5 == null) {
                                                list4 = list3;
                                                groupTicketLegBreakupFareDetailsAppModel = null;
                                            } else {
                                                ArrayList arrayList11 = new ArrayList();
                                                for (GenericMobileTicketFareBreakupApiResponseModel genericMobileTicketFareBreakupApiResponseModel : list5) {
                                                    String str13 = genericMobileTicketFareBreakupApiResponseModel.f8120a;
                                                    if (str13 == null) {
                                                        list6 = list3;
                                                    } else {
                                                        if (StringsKt.F(str13)) {
                                                            str13 = null;
                                                        }
                                                        if (str13 == null) {
                                                            list6 = list3;
                                                        } else {
                                                            Long l4 = genericMobileTicketFareBreakupApiResponseModel.b;
                                                            list6 = list3;
                                                            if (l4 != null) {
                                                                long jLongValue2 = l4.longValue();
                                                                Integer num4 = genericMobileTicketFareBreakupApiResponseModel.c;
                                                                if (num4 != null && (fareBreakupOperationTypeA = FetchMobileTicketFareResponseApiModelKt.a(num4.intValue())) != null) {
                                                                    if (fareBreakupOperationTypeA == FareBreakupOperationType.NO_OP) {
                                                                        fareBreakupOperationTypeA = null;
                                                                    }
                                                                    fareBreakupAppModel = fareBreakupOperationTypeA != null ? new FareBreakupAppModel(str13, fareBreakupOperationTypeA, jLongValue2) : null;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if (fareBreakupAppModel != null) {
                                                        arrayList11.add(fareBreakupAppModel);
                                                    }
                                                    list3 = list6;
                                                }
                                                list4 = list3;
                                                groupTicketLegBreakupFareDetailsAppModel = null;
                                                if (arrayList11.size() == list5.size()) {
                                                    Integer num5 = groupTicketLegBreakupApiModel.f5826a;
                                                    int iIntValue6 = num5 != null ? num5.intValue() : i;
                                                    String str14 = groupTicketLegBreakupApiModel.c;
                                                    String str15 = str14 == null ? "" : str14;
                                                    String str16 = groupTicketLegBreakupApiModel.d;
                                                    String str17 = str16 == null ? "" : str16;
                                                    Long l5 = groupTicketLegBreakupApiModel.e;
                                                    groupTicketLegBreakupFareDetailsAppModel2 = new GroupTicketLegBreakupFareDetailsAppModel(iIntValue6, chaloTransitMode2, str15, str17, l5 != null ? l5.longValue() : 0L, groupTicketLegBreakupApiModel.f, arrayList11);
                                                }
                                            }
                                            groupTicketLegBreakupFareDetailsAppModel2 = groupTicketLegBreakupFareDetailsAppModel;
                                        }
                                    } else {
                                        list4 = list3;
                                        groupTicketLegBreakupFareDetailsAppModel = null;
                                        groupTicketLegBreakupFareDetailsAppModel2 = groupTicketLegBreakupFareDetailsAppModel;
                                    }
                                    if (groupTicketLegBreakupFareDetailsAppModel2 != null) {
                                        arrayList4.add(groupTicketLegBreakupFareDetailsAppModel2);
                                    }
                                    list3 = list4;
                                }
                                if (arrayList4.size() == list3.size()) {
                                    arrayList4 = null;
                                }
                                arrayList2.add(arrayList4);
                            }
                            groupTicketBookingFareResponseAppModel = null;
                            num = groupTicketBookingFareResponseApiModel.b;
                            if (num == null) {
                                iIntValue = Integer.MAX_VALUE;
                            } else {
                                if (num.intValue() < 0) {
                                    num = null;
                                }
                                if (num != null) {
                                    iIntValue = num.intValue();
                                } else {
                                    iIntValue = Integer.MAX_VALUE;
                                }
                            }
                            arrayList3 = new ArrayList(CollectionsKt.v(list11, 10));
                            it3 = list11.iterator();
                            i2 = i;
                            while (true) {
                                if (it3.hasNext()) {
                                    next = it3.next();
                                    i4 = i2 + 1;
                                    if (i2 >= 0) {
                                        CollectionsKt.z0();
                                        throw null;
                                    }
                                    groupTicketCategoriesApiModel = (GroupTicketCategoriesApiModel) next;
                                    num2 = groupTicketCategoriesApiModel.e;
                                    if (num2 == null) {
                                        iIntValue2 = i;
                                    } else {
                                        if (num2.intValue() < 0) {
                                            num2 = null;
                                        }
                                        if (num2 != null) {
                                            iIntValue2 = num2.intValue();
                                        } else {
                                            iIntValue2 = i;
                                        }
                                    }
                                    num3 = groupTicketCategoriesApiModel.f;
                                    if (num3 == null) {
                                        iIntValue3 = Integer.MAX_VALUE;
                                    } else {
                                        if (num3.intValue() < 0) {
                                            num3 = null;
                                        }
                                        if (num3 != null) {
                                            iIntValue3 = num3.intValue();
                                        } else {
                                            iIntValue3 = Integer.MAX_VALUE;
                                        }
                                    }
                                    if (iIntValue2 > iIntValue3) {
                                        pair = new Pair(Integer.valueOf(i), Integer.MAX_VALUE);
                                    } else {
                                        pair = new Pair(Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3));
                                    }
                                    iIntValue4 = ((Number) pair.getFirst()).intValue();
                                    iIntValue5 = ((Number) pair.getSecond()).intValue();
                                    str2 = groupTicketCategoriesApiModel.f5806a;
                                    if (str2 != null || (str3 = groupTicketCategoriesApiModel.b) == null || (l2 = groupTicketCategoriesApiModel.c) == null) {
                                        break;
                                    }
                                    long jLongValue3 = l2.longValue();
                                    Long l6 = groupTicketCategoriesApiModel.d;
                                    list2 = (List) arrayList2.get(i2);
                                    if (list2 == null) {
                                        list2 = EmptyList.f17557a;
                                    }
                                    arrayList3.add(new GroupTicketCategoryFareDetailsAppModel(str2, str3, jLongValue3, l6, iIntValue4, iIntValue5, list2));
                                    i2 = i4;
                                } else {
                                    size = arrayList3.size();
                                    i3 = i;
                                    j = 0;
                                    while (i3 < size) {
                                        Object obj4 = arrayList3.get(i3);
                                        i3++;
                                        j += (long) ((GroupTicketCategoryFareDetailsAppModel) obj4).e;
                                    }
                                    if (j > iIntValue) {
                                        break;
                                    }
                                    groupTicketBookingFareResponseAppModel2 = new GroupTicketBookingFareResponseAppModel(iIntValue, str12, arrayList3);
                                }
                            }
                        }
                        groupTicketBookingFareResponseAppModel2 = groupTicketBookingFareResponseAppModel;
                    }
                    groupTicketBookingFareResponseAppModel = null;
                    groupTicketBookingFareResponseAppModel2 = groupTicketBookingFareResponseAppModel;
                }
            }
        }
        if (groupTicketBookingFareResponseAppModel2 != null) {
            return groupTicketBookingFareResponseAppModel2;
        }
        throw new InvalidFareResponseDataException("Invalid fare response");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.multimodalticket.data.repository.MultiModalGroupTicketRepository
    public final Object f(String str, String str2, ContinuationImpl continuationImpl) {
        MultiModalGroupTicketRepositoryImpl$getAllGroupTickets$1 multiModalGroupTicketRepositoryImpl$getAllGroupTickets$1;
        if (continuationImpl instanceof MultiModalGroupTicketRepositoryImpl$getAllGroupTickets$1) {
            multiModalGroupTicketRepositoryImpl$getAllGroupTickets$1 = (MultiModalGroupTicketRepositoryImpl$getAllGroupTickets$1) continuationImpl;
            int i = multiModalGroupTicketRepositoryImpl$getAllGroupTickets$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                multiModalGroupTicketRepositoryImpl$getAllGroupTickets$1.label = i - Integer.MIN_VALUE;
            } else {
                multiModalGroupTicketRepositoryImpl$getAllGroupTickets$1 = new MultiModalGroupTicketRepositoryImpl$getAllGroupTickets$1(this, continuationImpl);
            }
        } else {
            multiModalGroupTicketRepositoryImpl$getAllGroupTickets$1 = new MultiModalGroupTicketRepositoryImpl$getAllGroupTickets$1(this, continuationImpl);
        }
        Object objA = multiModalGroupTicketRepositoryImpl$getAllGroupTickets$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = multiModalGroupTicketRepositoryImpl$getAllGroupTickets$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            multiModalGroupTicketRepositoryImpl$getAllGroupTickets$1.L$0 = str;
            multiModalGroupTicketRepositoryImpl$getAllGroupTickets$1.label = 1;
            objA = this.f.a(str2, multiModalGroupTicketRepositoryImpl$getAllGroupTickets$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) multiModalGroupTicketRepositoryImpl$getAllGroupTickets$1.L$0;
            ResultKt.b(objA);
        }
        Flow entityFlow = this.b.e(str, ((ClusterConfig) objA).b);
        Intrinsics.i(entityFlow, "entityFlow");
        return FlowKt.H(entityFlow, new MultiModalGroupTicketEntityToAppModelConverter$convertAll$$inlined$flatMapLatest$1(null, this.c));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // app.chalo.multimodalticket.data.repository.MultiModalGroupTicketRepository
    public final Object g(GroupTicketCreateOrderRequestAppModel groupTicketCreateOrderRequestAppModel, ContinuationImpl continuationImpl) {
        MultiModalGroupTicketRepositoryImpl$createGroupTicketOrder$1 multiModalGroupTicketRepositoryImpl$createGroupTicketOrder$1;
        String str;
        long j;
        ArrayList arrayList;
        ArrayList arrayList2;
        if (continuationImpl instanceof MultiModalGroupTicketRepositoryImpl$createGroupTicketOrder$1) {
            multiModalGroupTicketRepositoryImpl$createGroupTicketOrder$1 = (MultiModalGroupTicketRepositoryImpl$createGroupTicketOrder$1) continuationImpl;
            int i = multiModalGroupTicketRepositoryImpl$createGroupTicketOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                multiModalGroupTicketRepositoryImpl$createGroupTicketOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                multiModalGroupTicketRepositoryImpl$createGroupTicketOrder$1 = new MultiModalGroupTicketRepositoryImpl$createGroupTicketOrder$1(this, continuationImpl);
            }
        } else {
            multiModalGroupTicketRepositoryImpl$createGroupTicketOrder$1 = new MultiModalGroupTicketRepositoryImpl$createGroupTicketOrder$1(this, continuationImpl);
        }
        Object objC = multiModalGroupTicketRepositoryImpl$createGroupTicketOrder$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = multiModalGroupTicketRepositoryImpl$createGroupTicketOrder$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            Intrinsics.i(groupTicketCreateOrderRequestAppModel, "<this>");
            String str2 = groupTicketCreateOrderRequestAppModel.f5855a;
            String str3 = groupTicketCreateOrderRequestAppModel.b;
            String str4 = groupTicketCreateOrderRequestAppModel.c;
            long j2 = groupTicketCreateOrderRequestAppModel.d;
            ArrayList arrayList3 = groupTicketCreateOrderRequestAppModel.e;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.v(arrayList3, 10));
            int size = arrayList3.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList3.get(i3);
                i3++;
                GroupTicketCreateOrderPassengerDetailAppModel groupTicketCreateOrderPassengerDetailAppModel = (GroupTicketCreateOrderPassengerDetailAppModel) obj;
                arrayList4.add(new GroupTicketCreateOrderPassengerDetailApiModel(groupTicketCreateOrderPassengerDetailAppModel.f5854a, groupTicketCreateOrderPassengerDetailAppModel.b));
            }
            ArrayList arrayList5 = groupTicketCreateOrderRequestAppModel.f;
            ArrayList arrayList6 = new ArrayList(CollectionsKt.v(arrayList5, 10));
            int size2 = arrayList5.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList5.get(i4);
                int i5 = i4 + 1;
                GroupTicketCreateOrderLegAppModel groupTicketCreateOrderLegAppModel = (GroupTicketCreateOrderLegAppModel) obj2;
                int i6 = groupTicketCreateOrderLegAppModel.f5852a;
                String str5 = groupTicketCreateOrderLegAppModel.b;
                ArrayList arrayList7 = arrayList5;
                String str6 = groupTicketCreateOrderLegAppModel.c;
                int i7 = size2;
                long j3 = groupTicketCreateOrderLegAppModel.d;
                GroupTicketCreateOrderTripDetailAppModel groupTicketCreateOrderTripDetailAppModel = groupTicketCreateOrderLegAppModel.e;
                String str7 = groupTicketCreateOrderTripDetailAppModel.f5857a;
                GroupTicketCreateOrderStopAppModel groupTicketCreateOrderStopAppModel = groupTicketCreateOrderTripDetailAppModel.b;
                String str8 = str2;
                GroupTicketCreateOrderStopApiModel groupTicketCreateOrderStopApiModel = new GroupTicketCreateOrderStopApiModel(groupTicketCreateOrderStopAppModel.f5856a, groupTicketCreateOrderStopAppModel.b, groupTicketCreateOrderStopAppModel.c);
                GroupTicketCreateOrderStopAppModel groupTicketCreateOrderStopAppModel2 = groupTicketCreateOrderTripDetailAppModel.c;
                String str9 = str3;
                GroupTicketCreateOrderStopApiModel groupTicketCreateOrderStopApiModel2 = new GroupTicketCreateOrderStopApiModel(groupTicketCreateOrderStopAppModel2.f5856a, groupTicketCreateOrderStopAppModel2.b, groupTicketCreateOrderStopAppModel2.c);
                List list = groupTicketCreateOrderTripDetailAppModel.d;
                if (list != null) {
                    List list2 = list;
                    arrayList2 = new ArrayList(CollectionsKt.v(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        GroupTicketCreateOrderMetroLineOverviewAppModel groupTicketCreateOrderMetroLineOverviewAppModel = (GroupTicketCreateOrderMetroLineOverviewAppModel) it.next();
                        String str10 = groupTicketCreateOrderMetroLineOverviewAppModel.f5853a;
                        Iterator it2 = it;
                        String str11 = groupTicketCreateOrderMetroLineOverviewAppModel.b;
                        ArrayList arrayList8 = groupTicketCreateOrderMetroLineOverviewAppModel.c;
                        String str12 = str4;
                        long j4 = j2;
                        ArrayList arrayList9 = new ArrayList(CollectionsKt.v(arrayList8, 10));
                        int size3 = arrayList8.size();
                        int i8 = 0;
                        while (i8 < size3) {
                            Object obj3 = arrayList8.get(i8);
                            ArrayList arrayList10 = arrayList8;
                            GroupTicketCreateOrderStopAppModel groupTicketCreateOrderStopAppModel3 = (GroupTicketCreateOrderStopAppModel) obj3;
                            arrayList9.add(new GroupTicketCreateOrderStopApiModel(groupTicketCreateOrderStopAppModel3.f5856a, groupTicketCreateOrderStopAppModel3.b, groupTicketCreateOrderStopAppModel3.c));
                            i8++;
                            arrayList8 = arrayList10;
                            size3 = size3;
                            arrayList4 = arrayList4;
                        }
                        arrayList2.add(new GroupTicketCreateOrderMetroLineOverviewApiModel(str10, str11, arrayList9));
                        it = it2;
                        str4 = str12;
                        j2 = j4;
                    }
                    str = str4;
                    j = j2;
                    arrayList = arrayList4;
                } else {
                    str = str4;
                    j = j2;
                    arrayList = arrayList4;
                    arrayList2 = null;
                }
                arrayList6.add(new GroupTicketCreateOrderLegApiModel(i6, str5, str6, j3, new GroupTicketCreateOrderTripDetailApiModel(str7, groupTicketCreateOrderStopApiModel, groupTicketCreateOrderStopApiModel2, arrayList2)));
                arrayList5 = arrayList7;
                size2 = i7;
                i4 = i5;
                str2 = str8;
                str3 = str9;
                str4 = str;
                j2 = j;
                arrayList4 = arrayList;
            }
            GroupTicketCreateOrderRequestApiModel groupTicketCreateOrderRequestApiModel = new GroupTicketCreateOrderRequestApiModel(str2, str3, str4, j2, arrayList4, arrayList6);
            multiModalGroupTicketRepositoryImpl$createGroupTicketOrder$1.label = 1;
            objC = this.f5880a.c(groupTicketCreateOrderRequestApiModel, multiModalGroupTicketRepositoryImpl$createGroupTicketOrder$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        return CreateOrderResponseApiModelKt.a((CreateOrderResponseApiModel) objC);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00be, code lost:
    
        if (r7.b.f(r8, r0) == r1) goto L39;
     */
    @Override // app.chalo.multimodalticket.data.repository.MultiModalGroupTicketRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r8, java.lang.String r9, app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketAppModel r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof app.chalo.multimodalticket.data.repository.MultiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTicket$1
            if (r0 == 0) goto L13
            r0 = r11
            app.chalo.multimodalticket.data.repository.MultiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTicket$1 r0 = (app.chalo.multimodalticket.data.repository.MultiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTicket$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.multimodalticket.data.repository.MultiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTicket$1 r0 = new app.chalo.multimodalticket.data.repository.MultiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTicket$1
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L5c
            if (r2 == r5) goto L4a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            kotlin.ResultKt.b(r11)
            goto Lc1
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            java.lang.Object r8 = r0.L$3
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r0.L$2
            app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketAppModel r9 = (app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketAppModel) r9
            java.lang.Object r10 = r0.L$1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r2 = r0.L$0
            java.lang.String r2 = (java.lang.String) r2
            kotlin.ResultKt.b(r11)
            goto L9c
        L4a:
            java.lang.Object r8 = r0.L$2
            r10 = r8
            app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketAppModel r10 = (app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketAppModel) r10
            java.lang.Object r8 = r0.L$1
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r0.L$0
            java.lang.String r8 = (java.lang.String) r8
            kotlin.ResultKt.b(r11)
            goto L70
        L5c:
            kotlin.ResultKt.b(r11)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r10
            r0.label = r5
            app.chalo.providers.UserProfileDetailsProvider r11 = r7.d
            java.lang.Object r11 = r11.k(r0)
            if (r11 != r1) goto L70
            goto Lc0
        L70:
            java.lang.String r11 = (java.lang.String) r11
            if (r11 != 0) goto L77
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        L77:
            app.chalo.providers.cityprovider.CityProvider r2 = r7.e
            java.lang.String r2 = r2.h()
            if (r2 != 0) goto L82
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        L82:
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r10
            r0.L$3 = r11
            r0.label = r4
            app.chalo.domain.GetClusterConfigForCityUseCase r4 = r7.f
            java.lang.Object r2 = r4.a(r2, r0)
            if (r2 != r1) goto L95
            goto Lc0
        L95:
            r6 = r2
            r2 = r8
            r8 = r11
            r11 = r6
            r6 = r10
            r10 = r9
            r9 = r6
        L9c:
            app.chalo.data.ClusterConfig r11 = (app.chalo.data.ClusterConfig) r11
            java.util.List r11 = r11.b
            boolean r8 = k(r2, r10, r8, r11)
            if (r8 != 0) goto La9
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        La9:
            app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketPersistenceData r8 = app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketAppModelToEntityMapperKt.a(r9)
            r9 = 0
            r0.L$0 = r9
            r0.L$1 = r9
            r0.L$2 = r9
            r0.L$3 = r9
            r0.label = r3
            app.chalo.multimodalticket.data.local.MultiModalGroupTicketLocalDataSource r9 = r7.b
            java.lang.Object r8 = r9.f(r8, r0)
            if (r8 != r1) goto Lc1
        Lc0:
            return r1
        Lc1:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.multimodalticket.data.repository.MultiModalGroupTicketRepositoryImpl.h(java.lang.String, java.lang.String, app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketAppModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // app.chalo.multimodalticket.data.repository.MultiModalGroupTicketRepository
    public final Object i(GroupTicketSummaryRequestAppModel groupTicketSummaryRequestAppModel, ContinuationImpl continuationImpl) throws MultiModalGroupTicketSummaryInvalidResponseException {
        MultiModalGroupTicketRepositoryImpl$getGroupTicketSummary$1 multiModalGroupTicketRepositoryImpl$getGroupTicketSummary$1;
        String str;
        GroupTicketSummaryRequestAppModel groupTicketSummaryRequestAppModel2;
        ArrayList arrayList;
        if (continuationImpl instanceof MultiModalGroupTicketRepositoryImpl$getGroupTicketSummary$1) {
            multiModalGroupTicketRepositoryImpl$getGroupTicketSummary$1 = (MultiModalGroupTicketRepositoryImpl$getGroupTicketSummary$1) continuationImpl;
            int i = multiModalGroupTicketRepositoryImpl$getGroupTicketSummary$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                multiModalGroupTicketRepositoryImpl$getGroupTicketSummary$1.label = i - Integer.MIN_VALUE;
            } else {
                multiModalGroupTicketRepositoryImpl$getGroupTicketSummary$1 = new MultiModalGroupTicketRepositoryImpl$getGroupTicketSummary$1(this, continuationImpl);
            }
        } else {
            multiModalGroupTicketRepositoryImpl$getGroupTicketSummary$1 = new MultiModalGroupTicketRepositoryImpl$getGroupTicketSummary$1(this, continuationImpl);
        }
        Object objB = multiModalGroupTicketRepositoryImpl$getGroupTicketSummary$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = multiModalGroupTicketRepositoryImpl$getGroupTicketSummary$1.label;
        String str2 = "<this>";
        if (i2 == 0) {
            ResultKt.b(objB);
            Intrinsics.i(groupTicketSummaryRequestAppModel, "<this>");
            String str3 = groupTicketSummaryRequestAppModel.f5870a;
            String str4 = groupTicketSummaryRequestAppModel.c;
            String str5 = groupTicketSummaryRequestAppModel.b;
            ArrayList arrayList2 = groupTicketSummaryRequestAppModel.d;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.v(arrayList2, 10));
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                GroupTicketSummaryPassengerDetailAppModel groupTicketSummaryPassengerDetailAppModel = (GroupTicketSummaryPassengerDetailAppModel) obj;
                arrayList3.add(new GroupTicketSummaryPassengerDetailApiModel(groupTicketSummaryPassengerDetailAppModel.f5869a, groupTicketSummaryPassengerDetailAppModel.b));
            }
            ArrayList arrayList4 = groupTicketSummaryRequestAppModel.e;
            ArrayList arrayList5 = new ArrayList(CollectionsKt.v(arrayList4, 10));
            int size2 = arrayList4.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList4.get(i4);
                int i5 = i4 + 1;
                GroupTicketSummaryLegAppModel groupTicketSummaryLegAppModel = (GroupTicketSummaryLegAppModel) obj2;
                int i6 = groupTicketSummaryLegAppModel.f5867a;
                ArrayList arrayList6 = arrayList4;
                String mode = groupTicketSummaryLegAppModel.b.getMode();
                int i7 = size2;
                String str6 = groupTicketSummaryLegAppModel.c;
                GroupTicketSummaryTripDetailAppModel groupTicketSummaryTripDetailAppModel = groupTicketSummaryLegAppModel.d;
                String str7 = groupTicketSummaryTripDetailAppModel.f5873a;
                String str8 = str3;
                GroupTicketSummaryStopAppModel groupTicketSummaryStopAppModel = groupTicketSummaryTripDetailAppModel.b;
                String str9 = str4;
                String str10 = str5;
                ArrayList arrayList7 = arrayList3;
                GroupTicketSummaryStopApiModel groupTicketSummaryStopApiModel = new GroupTicketSummaryStopApiModel(groupTicketSummaryStopAppModel.f5872a, groupTicketSummaryStopAppModel.b, groupTicketSummaryStopAppModel.c);
                GroupTicketSummaryStopAppModel groupTicketSummaryStopAppModel2 = groupTicketSummaryTripDetailAppModel.c;
                String str11 = str2;
                GroupTicketSummaryStopApiModel groupTicketSummaryStopApiModel2 = new GroupTicketSummaryStopApiModel(groupTicketSummaryStopAppModel2.f5872a, groupTicketSummaryStopAppModel2.b, groupTicketSummaryStopAppModel2.c);
                List list = groupTicketSummaryTripDetailAppModel.d;
                if (list != null) {
                    List list2 = list;
                    arrayList = new ArrayList(CollectionsKt.v(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        GroupTicketSummaryMetroLineOverviewAppModel groupTicketSummaryMetroLineOverviewAppModel = (GroupTicketSummaryMetroLineOverviewAppModel) it.next();
                        String str12 = groupTicketSummaryMetroLineOverviewAppModel.f5868a;
                        Iterator it2 = it;
                        String str13 = groupTicketSummaryMetroLineOverviewAppModel.b;
                        ArrayList arrayList8 = groupTicketSummaryMetroLineOverviewAppModel.c;
                        CoroutineSingletons coroutineSingletons2 = coroutineSingletons;
                        ArrayList arrayList9 = new ArrayList(CollectionsKt.v(arrayList8, 10));
                        int size3 = arrayList8.size();
                        int i8 = 0;
                        while (i8 < size3) {
                            int i9 = size3;
                            GroupTicketSummaryStopAppModel groupTicketSummaryStopAppModel3 = (GroupTicketSummaryStopAppModel) arrayList8.get(i8);
                            arrayList9.add(new GroupTicketSummaryStopApiModel(groupTicketSummaryStopAppModel3.f5872a, groupTicketSummaryStopAppModel3.b, groupTicketSummaryStopAppModel3.c));
                            i8++;
                            size3 = i9;
                            arrayList8 = arrayList8;
                            multiModalGroupTicketRepositoryImpl$getGroupTicketSummary$1 = multiModalGroupTicketRepositoryImpl$getGroupTicketSummary$1;
                        }
                        arrayList.add(new GroupTicketSummaryMetroLineOverviewApiModel(str12, str13, arrayList9));
                        it = it2;
                        coroutineSingletons = coroutineSingletons2;
                    }
                } else {
                    arrayList = null;
                }
                MultiModalGroupTicketRepositoryImpl$getGroupTicketSummary$1 multiModalGroupTicketRepositoryImpl$getGroupTicketSummary$2 = multiModalGroupTicketRepositoryImpl$getGroupTicketSummary$1;
                CoroutineSingletons coroutineSingletons3 = coroutineSingletons;
                arrayList5.add(new GroupTicketSummaryLegApiModel(i6, mode, str6, new GroupTicketSummaryTripDetailApiModel(str7, groupTicketSummaryStopApiModel, groupTicketSummaryStopApiModel2, arrayList)));
                arrayList4 = arrayList6;
                size2 = i7;
                i4 = i5;
                str3 = str8;
                str4 = str9;
                str5 = str10;
                arrayList3 = arrayList7;
                str2 = str11;
                coroutineSingletons = coroutineSingletons3;
                multiModalGroupTicketRepositoryImpl$getGroupTicketSummary$1 = multiModalGroupTicketRepositoryImpl$getGroupTicketSummary$2;
            }
            CoroutineSingletons coroutineSingletons4 = coroutineSingletons;
            str = str2;
            GroupTicketSummaryRequestApiModel groupTicketSummaryRequestApiModel = new GroupTicketSummaryRequestApiModel(str3, str4, str5, arrayList3, arrayList5);
            groupTicketSummaryRequestAppModel2 = groupTicketSummaryRequestAppModel;
            multiModalGroupTicketRepositoryImpl$getGroupTicketSummary$1.L$0 = groupTicketSummaryRequestAppModel2;
            multiModalGroupTicketRepositoryImpl$getGroupTicketSummary$1.label = 1;
            objB = this.f5880a.b(groupTicketSummaryRequestApiModel, multiModalGroupTicketRepositoryImpl$getGroupTicketSummary$1);
            if (objB == coroutineSingletons4) {
                return coroutineSingletons4;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            groupTicketSummaryRequestAppModel2 = (GroupTicketSummaryRequestAppModel) multiModalGroupTicketRepositoryImpl$getGroupTicketSummary$1.L$0;
            ResultKt.b(objB);
            str = "<this>";
        }
        GroupTicketSummaryResponseApiModel groupTicketSummaryResponseApiModel = (GroupTicketSummaryResponseApiModel) objB;
        Intrinsics.i(groupTicketSummaryResponseApiModel, str);
        List list3 = groupTicketSummaryResponseApiModel.b;
        ArrayList arrayList10 = new ArrayList();
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            GroupTicketLegFareDetailAppModel groupTicketLegFareDetailAppModelA = GroupTicketSummaryResponseAppModelKt.a((GroupTicketLegFareDetailApiModel) it3.next());
            if (groupTicketLegFareDetailAppModelA != null) {
                arrayList10.add(groupTicketLegFareDetailAppModelA);
            }
        }
        GroupTicketSummaryResponseAppModel groupTicketSummaryResponseAppModel = arrayList10.size() != list3.size() ? null : new GroupTicketSummaryResponseAppModel(groupTicketSummaryResponseApiModel.f5842a, arrayList10);
        if (groupTicketSummaryResponseAppModel == null) {
            throw new MultiModalGroupTicketSummaryInvalidResponseException("Invalid group ticket summary response");
        }
        ArrayList arrayList11 = groupTicketSummaryRequestAppModel2.e;
        ArrayList arrayList12 = new ArrayList(CollectionsKt.v(arrayList11, 10));
        int size4 = arrayList11.size();
        int i10 = 0;
        while (i10 < size4) {
            Object obj3 = arrayList11.get(i10);
            i10++;
            arrayList12.add(new Integer(((GroupTicketSummaryLegAppModel) obj3).f5867a));
        }
        ArrayList arrayList13 = groupTicketSummaryResponseAppModel.b;
        ArrayList arrayList14 = new ArrayList(CollectionsKt.v(arrayList13, 10));
        int size5 = arrayList13.size();
        int i11 = 0;
        while (i11 < size5) {
            Object obj4 = arrayList13.get(i11);
            i11++;
            arrayList14.add(new Integer(((GroupTicketLegFareDetailAppModel) obj4).f5860a));
        }
        if (CollectionsKt.G0(arrayList14).size() != arrayList14.size()) {
            throw new MultiModalGroupTicketSummaryInvalidResponseException("Invalid group ticket summary response: duplicate fare-detail sequence");
        }
        if (Intrinsics.d(CollectionsKt.G0(arrayList12), CollectionsKt.G0(arrayList14))) {
            return groupTicketSummaryResponseAppModel;
        }
        throw new MultiModalGroupTicketSummaryInvalidResponseException("Invalid group ticket summary response: fare-detail sequences do not match request");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00cc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // app.chalo.multimodalticket.data.repository.MultiModalGroupTicketRepository
    public final Object j(String str, String str2, ArrayList arrayList, ContinuationImpl continuationImpl) {
        MultiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1 multiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1;
        Object objK;
        List list;
        String strH;
        String str3;
        String str4;
        String str5;
        List list2;
        List list3;
        if (continuationImpl instanceof MultiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1) {
            multiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1 = (MultiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1) continuationImpl;
            int i = multiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                multiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1.label = i - Integer.MIN_VALUE;
            } else {
                multiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1 = new MultiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1(this, continuationImpl);
            }
        } else {
            multiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1 = new MultiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1(this, continuationImpl);
        }
        Object obj = multiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = multiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(obj);
            Intrinsics.i(arrayList, "<this>");
            ArrayList arrayList2 = new ArrayList(CollectionsKt.v(arrayList, 10));
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj2 = arrayList.get(i3);
                i3++;
                arrayList2.add(MultiModalGroupTicketAppModelToEntityMapperKt.a((MultiModalGroupTicketAppModel) obj2));
            }
            multiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1.L$0 = str;
            multiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1.L$1 = str2;
            multiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1.L$2 = arrayList2;
            multiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1.label = 1;
            objK = this.d.k(multiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1);
            list = arrayList2;
            if (objK != coroutineSingletons) {
            }
        }
        if (i2 == 1) {
            List list4 = (List) multiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1.L$2;
            str2 = (String) multiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1.L$1;
            String str6 = (String) multiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1.L$0;
            ResultKt.b(obj);
            list = list4;
            str = str6;
            objK = obj;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return unit;
            }
            str4 = (String) multiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1.L$3;
            List list5 = (List) multiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1.L$2;
            str5 = (String) multiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1.L$1;
            str3 = (String) multiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1.L$0;
            ResultKt.b(obj);
            list2 = list5;
        }
        list3 = ((ClusterConfig) obj).b;
        if (!k(str3, str5, str4, list3)) {
            return unit;
        }
        multiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1.L$0 = null;
        multiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1.L$1 = null;
        multiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1.L$2 = null;
        multiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1.L$3 = null;
        multiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1.label = 3;
        return this.b.g(str4, list3, list2, multiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1) == coroutineSingletons ? coroutineSingletons : unit;
        String str7 = (String) objK;
        if (str7 != null && (strH = this.e.h()) != null) {
            multiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1.L$0 = str;
            multiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1.L$1 = str2;
            multiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1.L$2 = list;
            multiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1.L$3 = str7;
            multiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1.label = 2;
            Object objA = this.f.a(strH, multiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1);
            if (objA != coroutineSingletons) {
                str3 = str;
                str4 = str7;
                str5 = str2;
                list2 = list;
                obj = objA;
                list3 = ((ClusterConfig) obj).b;
                if (!k(str3, str5, str4, list3)) {
                    return unit;
                }
                multiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1.L$0 = null;
                multiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1.L$1 = null;
                multiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1.L$2 = null;
                multiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1.L$3 = null;
                multiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1.label = 3;
                if (this.b.g(str4, list3, list2, multiModalGroupTicketRepositoryImpl$deleteAndInsertGroupTickets$1) == coroutineSingletons) {
                }
            }
        }
    }
}
