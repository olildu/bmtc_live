package app.chalo.premiumbus.domain;

import app.chalo.extensions.DataStoreExtensionsKt$getValueAsFlow$$inlined$map$1;
import app.chalo.features.onetimeoffer.IUserPreferencesDataStore;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsAppRequestModel;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsInfoAppModel;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.premiumbus.data.models.app.PBModeToReachStopType;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import app.chalo.premiumbus.data.models.app.SlotSearchRequestAppModel;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.utils.ChaloUseCaseResult;
import com.freshchat.consumer.sdk.beans.config.DefaultRefreshIntervals;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/GetAvailableSlotsForODPairsPaginatedUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetAvailableSlotsForODPairsPaginatedUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FetchPBAvailableSlotsUseCase f7198a;
    public final CityProvider b;
    public final UserProfileDetailsProvider c;
    public final IUserPreferencesDataStore d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7199a;

        static {
            int[] iArr = new int[PBAvailableSlotsFetchFailedReasons.values().length];
            try {
                iArr[PBAvailableSlotsFetchFailedReasons.INVALID_WINDOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PBAvailableSlotsFetchFailedReasons.LOCAL_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PBAvailableSlotsFetchFailedReasons.SERVER_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PBAvailableSlotsFetchFailedReasons.PARSE_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PBAvailableSlotsFetchFailedReasons.UNKNOWN_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f7199a = iArr;
        }
    }

    public GetAvailableSlotsForODPairsPaginatedUseCase(IUserPreferencesDataStore iUserPreferencesDataStore, FetchPBAvailableSlotsUseCase fetchPBAvailableSlotsUseCase, UserProfileDetailsProvider userProfileDetailsProvider, CityProvider cityProvider) {
        this.f7198a = fetchPBAvailableSlotsUseCase;
        this.b = cityProvider;
        this.c = userProfileDetailsProvider;
        this.d = iUserPreferencesDataStore;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x030d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0313  */
    /* JADX WARN: Code duplicated, block: B:113:0x0318  */
    /* JADX WARN: Code duplicated, block: B:114:0x031b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0389  */
    /* JADX WARN: Code duplicated, block: B:118:0x038f  */
    /* JADX WARN: Code duplicated, block: B:122:0x03b1 A[EDGE_INSN: B:122:0x03b1->B:142:0x03fe BREAK  A[LOOP:5: B:124:0x03b8->B:196:0x03b8]] */
    /* JADX WARN: Code duplicated, block: B:123:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:125:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:144:0x0402  */
    /* JADX WARN: Code duplicated, block: B:146:0x040f  */
    /* JADX WARN: Code duplicated, block: B:149:0x041d  */
    /* JADX WARN: Code duplicated, block: B:151:0x0421  */
    /* JADX WARN: Code duplicated, block: B:153:0x0432  */
    /* JADX WARN: Code duplicated, block: B:155:0x0435  */
    /* JADX WARN: Code duplicated, block: B:157:0x0438  */
    /* JADX WARN: Code duplicated, block: B:159:0x043b  */
    /* JADX WARN: Code duplicated, block: B:161:0x043e  */
    /* JADX WARN: Code duplicated, block: B:163:0x0446  */
    /* JADX WARN: Code duplicated, block: B:165:0x044c  */
    /* JADX WARN: Code duplicated, block: B:167:0x0454  */
    /* JADX WARN: Code duplicated, block: B:169:0x0467  */
    /* JADX WARN: Code duplicated, block: B:171:0x046f  */
    /* JADX WARN: Code duplicated, block: B:173:0x0477  */
    /* JADX WARN: Code duplicated, block: B:177:0x020a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x03b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x018c A[EDGE_INSN: B:205:0x018c->B:46:0x018c BREAK  A[LOOP:7: B:39:0x014e->B:45:0x0173], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0108  */
    /* JADX WARN: Code duplicated, block: B:34:0x010a  */
    /* JADX WARN: Code duplicated, block: B:36:0x010d  */
    /* JADX WARN: Code duplicated, block: B:38:0x012a  */
    /* JADX WARN: Code duplicated, block: B:41:0x015a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0171  */
    /* JADX WARN: Code duplicated, block: B:48:0x0196  */
    /* JADX WARN: Code duplicated, block: B:50:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:54:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:57:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:60:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:62:0x0202  */
    /* JADX WARN: Code duplicated, block: B:67:0x0227  */
    /* JADX WARN: Code duplicated, block: B:69:0x023e  */
    /* JADX WARN: Code duplicated, block: B:72:0x024f A[LOOP:2: B:70:0x0249->B:72:0x024f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x025d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0265  */
    /* JADX WARN: Code duplicated, block: B:77:0x026e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0287  */
    /* JADX WARN: Code duplicated, block: B:82:0x0299  */
    /* JADX WARN: Code duplicated, block: B:83:0x029d  */
    /* JADX WARN: Code duplicated, block: B:87:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:90:0x02c0  */
    public final Object a(long j, List list, long j2, long j3, int i, int i2, ContinuationImpl continuationImpl) {
        GetAvailableSlotsForODPairsPaginatedUseCase$invoke$1 getAvailableSlotsForODPairsPaginatedUseCase$invoke$1;
        List list2;
        long j4;
        long j5;
        long j6;
        int i3;
        int i4;
        String str;
        String str2;
        List list3;
        int i5;
        String str3;
        int i6;
        long j7;
        long j8;
        String str4;
        ArrayList arrayListU;
        int size;
        int i7;
        int i8;
        int i9;
        int i10;
        List list4;
        ArrayList arrayList;
        long j9;
        Iterator it;
        boolean zHasNext;
        String str5;
        Iterator it2;
        CityProvider cityProvider;
        String strB;
        String str6;
        PBAvailableSlotsInfoAppModel pBAvailableSlotsInfoAppModel;
        Object objA;
        int i11;
        List list5;
        long j10;
        int i12;
        String strB2;
        int i13;
        ChaloUseCaseResult chaloUseCaseResult;
        PBAvailableSlotsFetchFailedReasons pBAvailableSlotsFetchFailedReasons;
        int i14;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList2;
        Iterator it3;
        int i15;
        int size2;
        int i16;
        PBAvailableSlotsInfoAppModel pBAvailableSlotsInfoAppModel2;
        List list6;
        boolean z;
        boolean z2;
        String fromStopId;
        String toStopId;
        List list7;
        List<PBAvailableSlotsTripAppModel> arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        Iterator it4;
        int i17;
        LinkedHashMap linkedHashMap2;
        PBAvailableSlotsInfoAppModel pBAvailableSlotsInfoAppModel3;
        boolean z3;
        PBAvailableSlotsInfoAppModel pBAvailableSlotsInfoAppModel4;
        Iterator it5;
        Pair pair;
        Object arrayList7;
        if (continuationImpl instanceof GetAvailableSlotsForODPairsPaginatedUseCase$invoke$1) {
            getAvailableSlotsForODPairsPaginatedUseCase$invoke$1 = (GetAvailableSlotsForODPairsPaginatedUseCase$invoke$1) continuationImpl;
            int i18 = getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.label;
            if ((i18 & Integer.MIN_VALUE) != 0) {
                getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.label = i18 - Integer.MIN_VALUE;
            } else {
                getAvailableSlotsForODPairsPaginatedUseCase$invoke$1 = new GetAvailableSlotsForODPairsPaginatedUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getAvailableSlotsForODPairsPaginatedUseCase$invoke$1 = new GetAvailableSlotsForODPairsPaginatedUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i19 = getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.label;
        IUserPreferencesDataStore iUserPreferencesDataStore = this.d;
        if (i19 == 0) {
            ResultKt.b(obj);
            String strM = this.c.m();
            if (strM == null) {
                return new ChaloUseCaseResult.Failure(ODPairAndSlotsFetchFailedReasons.UserNotFound.f7214a);
            }
            DataStoreExtensionsKt$getValueAsFlow$$inlined$map$1 dataStoreExtensionsKt$getValueAsFlow$$inlined$map$1B = iUserPreferencesDataStore.b();
            list2 = list;
            getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.L$0 = list2;
            getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.L$1 = strM;
            j4 = j;
            getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.J$0 = j4;
            j5 = j2;
            getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.J$1 = j5;
            j6 = j3;
            getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.J$2 = j6;
            i3 = i;
            getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.I$0 = i3;
            i4 = i2;
            getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.I$1 = i4;
            getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.label = 1;
            Object objV = FlowKt.v(dataStoreExtensionsKt$getValueAsFlow$$inlined$map$1B, getAvailableSlotsForODPairsPaginatedUseCase$invoke$1);
            if (objV != coroutineSingletons) {
                str = strM;
                obj = objV;
            }
            return coroutineSingletons;
        }
        if (i19 == 1) {
            int i20 = getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.I$1;
            int i21 = getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.I$0;
            long j11 = getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.J$2;
            j5 = getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.J$1;
            long j12 = getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.J$0;
            String str7 = (String) getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.L$1;
            List list8 = (List) getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.L$0;
            ResultKt.b(obj);
            i4 = i20;
            str = str7;
            i3 = i21;
            list2 = list8;
            j6 = j11;
            j4 = j12;
        } else {
            if (i19 == 2) {
                i6 = getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.I$1;
                i5 = getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.I$0;
                j6 = getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.J$2;
                j7 = getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.J$1;
                j8 = getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.J$0;
                str2 = (String) getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.L$2;
                str3 = (String) getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.L$1;
                list3 = (List) getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.L$0;
                ResultKt.b(obj);
                str4 = (String) obj;
                arrayListU = CollectionsKt.u(list3, i6);
                size = arrayListU.size();
                if (i5 < size - 1) {
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if (i5 >= size) {
                    return new ChaloUseCaseResult.Success(new ODPairsAndRespectiveSlotsBetweenStops(i5, size, i6, 2, (List) EmptyList.f17557a, false));
                }
                i8 = i5;
                i9 = i6;
                i10 = size;
                list4 = (List) arrayListU.get(i8);
                String str8 = str3;
                List list9 = list4;
                String str9 = str2;
                j9 = j6;
                arrayList = new ArrayList(CollectionsKt.v(list9, 10));
                it = list9.iterator();
                while (true) {
                    zHasNext = it.hasNext();
                    str5 = "";
                    it2 = it;
                    cityProvider = this.b;
                    if (zHasNext) {
                        break;
                    }
                    PBOriginDestinationAppModel pBOriginDestinationAppModel = (PBOriginDestinationAppModel) it2.next();
                    List list10 = pBOriginDestinationAppModel.f7091a;
                    String str10 = pBOriginDestinationAppModel.c;
                    String str11 = pBOriginDestinationAppModel.h;
                    strB2 = CityProviderKt.b(cityProvider);
                    if (strB2 == null) {
                        str5 = strB2;
                    }
                    arrayList.add(new SlotSearchRequestAppModel(str10, str11, j7, j9, str5, list10));
                    it = it2;
                }
                strB = CityProviderKt.b(cityProvider);
                if (strB == null) {
                    str6 = "";
                } else {
                    str6 = strB;
                }
                PBAvailableSlotsAppRequestModel pBAvailableSlotsAppRequestModel = new PBAvailableSlotsAppRequestModel(str8, str9, str4, str6, arrayList);
                getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.L$0 = list4;
                pBAvailableSlotsInfoAppModel = null;
                getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.L$1 = null;
                getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.L$2 = null;
                getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.J$0 = j8;
                getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.I$0 = i8;
                getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.I$1 = i9;
                getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.I$2 = i10;
                getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.I$3 = i7;
                getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.label = 3;
                objA = this.f7198a.a(pBAvailableSlotsAppRequestModel, getAvailableSlotsForODPairsPaginatedUseCase$invoke$1);
                if (objA != coroutineSingletons) {
                    i11 = i7;
                    obj = objA;
                    list5 = list4;
                    j10 = j8;
                    i12 = i8;
                }
                return coroutineSingletons;
            }
            if (i19 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.I$3;
            i10 = getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.I$2;
            i9 = getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.I$1;
            i12 = getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.I$0;
            j10 = getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.J$0;
            list5 = (List) getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.L$0;
            ResultKt.b(obj);
            pBAvailableSlotsInfoAppModel = null;
        }
        i13 = i10;
        chaloUseCaseResult = (ChaloUseCaseResult) obj;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                throw new NoWhenBranchMatchedException();
            }
            pBAvailableSlotsFetchFailedReasons = (PBAvailableSlotsFetchFailedReasons) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
            i14 = WhenMappings.f7199a[pBAvailableSlotsFetchFailedReasons.ordinal()];
            if (i14 != 1) {
                return new ChaloUseCaseResult.Failure(ODPairAndSlotsFetchFailedReasons.InvalidWindow.f7208a);
            }
            if (i14 != 2) {
                return new ChaloUseCaseResult.Failure(ODPairAndSlotsFetchFailedReasons.LocalException.f7209a);
            }
            if (i14 != 3) {
                return new ChaloUseCaseResult.Failure(new ODPairAndSlotsFetchFailedReasons.ServerError(String.valueOf(pBAvailableSlotsFetchFailedReasons.getErrorCodes())));
            }
            if (i14 != 4) {
                return new ChaloUseCaseResult.Failure(ODPairAndSlotsFetchFailedReasons.ResponseParseException.f7211a);
            }
            if (i14 == 5) {
                return new ChaloUseCaseResult.Failure(ODPairAndSlotsFetchFailedReasons.UnknownException.f7213a);
            }
            throw new NoWhenBranchMatchedException();
        }
        List list11 = (List) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
        linkedHashMap = new LinkedHashMap();
        for (Object obj2 : list11) {
            PBAvailableSlotsInfoAppModel pBAvailableSlotsInfoAppModel5 = (PBAvailableSlotsInfoAppModel) obj2;
            pair = new Pair(pBAvailableSlotsInfoAppModel5.f7087a, pBAvailableSlotsInfoAppModel5.b);
            arrayList7 = linkedHashMap.get(pair);
            if (arrayList7 == null) {
                arrayList7 = new ArrayList();
                linkedHashMap.put(pair, arrayList7);
            }
            ((List) arrayList7).add(obj2);
        }
        List list12 = list5;
        arrayList2 = new ArrayList(CollectionsKt.v(list12, 10));
        it3 = list12.iterator();
        while (it3.hasNext()) {
            PBOriginDestinationAppModel pBOriginDestinationAppModel2 = (PBOriginDestinationAppModel) it3.next();
            fromStopId = pBOriginDestinationAppModel2.c;
            toStopId = pBOriginDestinationAppModel2.h;
            list7 = (List) linkedHashMap.get(new Pair(fromStopId, toStopId));
            if (list7 != null) {
                arrayList3 = new ArrayList();
                it5 = list7.iterator();
                while (it5.hasNext()) {
                    CollectionsKt.i(((PBAvailableSlotsInfoAppModel) it5.next()).c, arrayList3);
                }
            } else {
                arrayList3 = EmptyList.f17557a;
            }
            if (arrayList3.isEmpty()) {
                it4 = it3;
                i17 = i11;
                linkedHashMap2 = linkedHashMap;
                pBAvailableSlotsInfoAppModel3 = pBAvailableSlotsInfoAppModel;
            } else {
                arrayList4 = new ArrayList();
                arrayList5 = new ArrayList();
                arrayList6 = new ArrayList();
                for (PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel : arrayList3) {
                    Iterator it6 = it3;
                    int i22 = i11;
                    if (pBAvailableSlotsTripAppModel.g <= j10) {
                        arrayList5.add(pBAvailableSlotsTripAppModel);
                    } else {
                        arrayList6.add(pBAvailableSlotsTripAppModel);
                    }
                    i11 = i22;
                    it3 = it6;
                }
                it4 = it3;
                i17 = i11;
                if (arrayList6.size() > 1) {
                    CollectionsKt.t0(arrayList6, new GetAvailableSlotsForODPairsPaginatedUseCase$filterHighlightedSlots$$inlined$sortBy$1());
                }
                if (arrayList5.size() > 1) {
                    CollectionsKt.t0(arrayList5, new GetAvailableSlotsForODPairsPaginatedUseCase$filterHighlightedSlots$$inlined$sortByDescending$1());
                }
                int i23 = 0;
                int i24 = 0;
                while (true) {
                    linkedHashMap2 = linkedHashMap;
                    if (arrayList4.size() >= 3 || (i23 >= arrayList6.size() && i24 >= arrayList5.size())) {
                        break;
                    }
                    if (i23 < arrayList6.size()) {
                        arrayList4.add(arrayList6.get(i23));
                        i23++;
                    }
                    if (arrayList4.size() < 3 && i24 < arrayList5.size()) {
                        arrayList4.add(arrayList5.get(i24));
                        i24++;
                    }
                    linkedHashMap = linkedHashMap2;
                }
                if (arrayList4.isEmpty()) {
                    pBAvailableSlotsInfoAppModel3 = null;
                } else {
                    pBAvailableSlotsInfoAppModel3 = new PBAvailableSlotsInfoAppModel(fromStopId, toStopId, arrayList4);
                }
            }
            if (i12 == i13 - 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            List routeIdsWithODPair = pBOriginDestinationAppModel2.f7091a;
            String str12 = pBOriginDestinationAppModel2.b;
            String fromStopName = pBOriginDestinationAppModel2.d;
            Long l = pBOriginDestinationAppModel2.e;
            Long l2 = pBOriginDestinationAppModel2.f;
            PBModeToReachStopType modeToReachFromStop = pBOriginDestinationAppModel2.g;
            String toStopName = pBOriginDestinationAppModel2.i;
            int i25 = i9;
            Long l3 = pBOriginDestinationAppModel2.j;
            Long l4 = pBOriginDestinationAppModel2.k;
            PBModeToReachStopType modeToReachToStop = pBOriginDestinationAppModel2.l;
            Intrinsics.i(routeIdsWithODPair, "routeIdsWithODPair");
            Intrinsics.i(fromStopId, "fromStopId");
            Intrinsics.i(fromStopName, "fromStopName");
            Intrinsics.i(modeToReachFromStop, "modeToReachFromStop");
            Intrinsics.i(toStopId, "toStopId");
            Intrinsics.i(toStopName, "toStopName");
            Intrinsics.i(modeToReachToStop, "modeToReachToStop");
            int i26 = i12;
            PBOriginDestinationAppModel pBOriginDestinationAppModel3 = new PBOriginDestinationAppModel(routeIdsWithODPair, str12, fromStopId, fromStopName, l, l2, modeToReachFromStop, toStopId, toStopName, l3, l4, modeToReachToStop, i26, i13, z3);
            if (arrayList3.isEmpty()) {
                pBAvailableSlotsInfoAppModel4 = null;
            } else {
                pBAvailableSlotsInfoAppModel4 = new PBAvailableSlotsInfoAppModel(fromStopId, toStopId, arrayList3);
            }
            arrayList2.add(new ODPairWithSlotsListAppModel(pBOriginDestinationAppModel3, pBAvailableSlotsInfoAppModel4, pBAvailableSlotsInfoAppModel3));
            i11 = i17;
            it3 = it4;
            linkedHashMap = linkedHashMap2;
            i9 = i25;
            i12 = i26;
            pBAvailableSlotsInfoAppModel = null;
        }
        i15 = i11;
        int i27 = i9;
        int i28 = i12;
        if (arrayList2.isEmpty()) {
            z = true;
            break;
        }
        size2 = arrayList2.size();
        i16 = 0;
        loop5: while (true) {
            if (i16 < size2) {
                z = true;
                break;
            }
            Object obj3 = arrayList2.get(i16);
            i16++;
            pBAvailableSlotsInfoAppModel2 = ((ODPairWithSlotsListAppModel) obj3).c;
            if (pBAvailableSlotsInfoAppModel2 == null && (list6 = pBAvailableSlotsInfoAppModel2.c) != null) {
                List<PBAvailableSlotsTripAppModel> list13 = list6;
                if (!(list13 instanceof Collection) || !list13.isEmpty()) {
                    for (PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel2 : list13) {
                        long j13 = j10 - 1800000;
                        long j14 = DefaultRefreshIntervals.REMOTE_CONFIG_FETCH_INTERVAL + j10;
                        long j15 = pBAvailableSlotsTripAppModel2.g;
                        if (j13 <= j15 && j15 <= j14) {
                            z = false;
                            break loop5;
                        }
                    }
                }
            }
        }
        if (i15 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new ChaloUseCaseResult.Success(new ODPairsAndRespectiveSlotsBetweenStops(arrayList2, z, i28, i13, z2, i27));
        String str13 = (String) obj;
        DataStoreExtensionsKt$getValueAsFlow$$inlined$map$1 dataStoreExtensionsKt$getValueAsFlow$$inlined$map$1D = iUserPreferencesDataStore.d();
        getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.L$0 = list2;
        getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.L$1 = str;
        getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.L$2 = str13;
        getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.J$0 = j4;
        getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.J$1 = j5;
        getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.J$2 = j6;
        getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.I$0 = i3;
        getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.I$1 = i4;
        getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.label = 2;
        Object objV2 = FlowKt.v(dataStoreExtensionsKt$getValueAsFlow$$inlined$map$1D, getAvailableSlotsForODPairsPaginatedUseCase$invoke$1);
        if (objV2 != coroutineSingletons) {
            long j16 = j4;
            str2 = str13;
            list3 = list2;
            obj = objV2;
            i5 = i3;
            str3 = str;
            i6 = i4;
            j7 = j5;
            j8 = j16;
            str4 = (String) obj;
            arrayListU = CollectionsKt.u(list3, i6);
            size = arrayListU.size();
            if (i5 < size - 1) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            if (i5 >= size) {
                return new ChaloUseCaseResult.Success(new ODPairsAndRespectiveSlotsBetweenStops(i5, size, i6, 2, (List) EmptyList.f17557a, false));
            }
            i8 = i5;
            i9 = i6;
            i10 = size;
            list4 = (List) arrayListU.get(i8);
            String str14 = str3;
            List list14 = list4;
            String str15 = str2;
            j9 = j6;
            arrayList = new ArrayList(CollectionsKt.v(list14, 10));
            it = list14.iterator();
            while (true) {
                zHasNext = it.hasNext();
                str5 = "";
                it2 = it;
                cityProvider = this.b;
                if (zHasNext) {
                    break;
                    break;
                }
                PBOriginDestinationAppModel pBOriginDestinationAppModel4 = (PBOriginDestinationAppModel) it2.next();
                List list15 = pBOriginDestinationAppModel4.f7091a;
                String str16 = pBOriginDestinationAppModel4.c;
                String str17 = pBOriginDestinationAppModel4.h;
                strB2 = CityProviderKt.b(cityProvider);
                if (strB2 == null) {
                    str5 = strB2;
                }
                arrayList.add(new SlotSearchRequestAppModel(str16, str17, j7, j9, str5, list15));
                it = it2;
            }
            strB = CityProviderKt.b(cityProvider);
            if (strB == null) {
                str6 = "";
            } else {
                str6 = strB;
            }
            PBAvailableSlotsAppRequestModel pBAvailableSlotsAppRequestModel2 = new PBAvailableSlotsAppRequestModel(str14, str15, str4, str6, arrayList);
            getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.L$0 = list4;
            pBAvailableSlotsInfoAppModel = null;
            getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.L$1 = null;
            getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.L$2 = null;
            getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.J$0 = j8;
            getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.I$0 = i8;
            getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.I$1 = i9;
            getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.I$2 = i10;
            getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.I$3 = i7;
            getAvailableSlotsForODPairsPaginatedUseCase$invoke$1.label = 3;
            objA = this.f7198a.a(pBAvailableSlotsAppRequestModel2, getAvailableSlotsForODPairsPaginatedUseCase$invoke$1);
            if (objA != coroutineSingletons) {
                i11 = i7;
                obj = objA;
                list5 = list4;
                j10 = j8;
                i12 = i8;
                i13 = i10;
                chaloUseCaseResult = (ChaloUseCaseResult) obj;
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pBAvailableSlotsFetchFailedReasons = (PBAvailableSlotsFetchFailedReasons) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
                    i14 = WhenMappings.f7199a[pBAvailableSlotsFetchFailedReasons.ordinal()];
                    if (i14 != 1) {
                        return new ChaloUseCaseResult.Failure(ODPairAndSlotsFetchFailedReasons.InvalidWindow.f7208a);
                    }
                    if (i14 != 2) {
                        return new ChaloUseCaseResult.Failure(ODPairAndSlotsFetchFailedReasons.LocalException.f7209a);
                    }
                    if (i14 != 3) {
                        return new ChaloUseCaseResult.Failure(new ODPairAndSlotsFetchFailedReasons.ServerError(String.valueOf(pBAvailableSlotsFetchFailedReasons.getErrorCodes())));
                    }
                    if (i14 != 4) {
                        return new ChaloUseCaseResult.Failure(ODPairAndSlotsFetchFailedReasons.ResponseParseException.f7211a);
                    }
                    if (i14 == 5) {
                        return new ChaloUseCaseResult.Failure(ODPairAndSlotsFetchFailedReasons.UnknownException.f7213a);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                List list16 = (List) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                linkedHashMap = new LinkedHashMap();
                while (r1.hasNext()) {
                    PBAvailableSlotsInfoAppModel pBAvailableSlotsInfoAppModel6 = (PBAvailableSlotsInfoAppModel) obj2;
                    pair = new Pair(pBAvailableSlotsInfoAppModel6.f7087a, pBAvailableSlotsInfoAppModel6.b);
                    arrayList7 = linkedHashMap.get(pair);
                    if (arrayList7 == null) {
                        arrayList7 = new ArrayList();
                        linkedHashMap.put(pair, arrayList7);
                    }
                    ((List) arrayList7).add(obj2);
                }
                List list17 = list5;
                arrayList2 = new ArrayList(CollectionsKt.v(list17, 10));
                it3 = list17.iterator();
                while (it3.hasNext()) {
                    PBOriginDestinationAppModel pBOriginDestinationAppModel5 = (PBOriginDestinationAppModel) it3.next();
                    fromStopId = pBOriginDestinationAppModel5.c;
                    toStopId = pBOriginDestinationAppModel5.h;
                    list7 = (List) linkedHashMap.get(new Pair(fromStopId, toStopId));
                    if (list7 != null) {
                        arrayList3 = new ArrayList();
                        it5 = list7.iterator();
                        while (it5.hasNext()) {
                            CollectionsKt.i(((PBAvailableSlotsInfoAppModel) it5.next()).c, arrayList3);
                        }
                    } else {
                        arrayList3 = EmptyList.f17557a;
                    }
                    if (arrayList3.isEmpty()) {
                        it4 = it3;
                        i17 = i11;
                        linkedHashMap2 = linkedHashMap;
                        pBAvailableSlotsInfoAppModel3 = pBAvailableSlotsInfoAppModel;
                    } else {
                        arrayList4 = new ArrayList();
                        arrayList5 = new ArrayList();
                        arrayList6 = new ArrayList();
                        while (r16.hasNext()) {
                            Iterator it7 = it3;
                            int i29 = i11;
                            if (pBAvailableSlotsTripAppModel.g <= j10) {
                                arrayList5.add(pBAvailableSlotsTripAppModel);
                            } else {
                                arrayList6.add(pBAvailableSlotsTripAppModel);
                            }
                            i11 = i29;
                            it3 = it7;
                        }
                        it4 = it3;
                        i17 = i11;
                        if (arrayList6.size() > 1) {
                            CollectionsKt.t0(arrayList6, new GetAvailableSlotsForODPairsPaginatedUseCase$filterHighlightedSlots$$inlined$sortBy$1());
                        }
                        if (arrayList5.size() > 1) {
                            CollectionsKt.t0(arrayList5, new GetAvailableSlotsForODPairsPaginatedUseCase$filterHighlightedSlots$$inlined$sortByDescending$1());
                        }
                        int i210 = 0;
                        int i211 = 0;
                        while (true) {
                            linkedHashMap2 = linkedHashMap;
                            if (arrayList4.size() >= 3) {
                                break;
                            }
                            break;
                            break;
                            linkedHashMap = linkedHashMap2;
                        }
                        if (arrayList4.isEmpty()) {
                            pBAvailableSlotsInfoAppModel3 = new PBAvailableSlotsInfoAppModel(fromStopId, toStopId, arrayList4);
                        } else {
                            pBAvailableSlotsInfoAppModel3 = null;
                        }
                    }
                    if (i12 == i13 - 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    List routeIdsWithODPair2 = pBOriginDestinationAppModel5.f7091a;
                    String str18 = pBOriginDestinationAppModel5.b;
                    String fromStopName2 = pBOriginDestinationAppModel5.d;
                    Long l5 = pBOriginDestinationAppModel5.e;
                    Long l6 = pBOriginDestinationAppModel5.f;
                    PBModeToReachStopType modeToReachFromStop2 = pBOriginDestinationAppModel5.g;
                    String toStopName2 = pBOriginDestinationAppModel5.i;
                    int i212 = i9;
                    Long l7 = pBOriginDestinationAppModel5.j;
                    Long l8 = pBOriginDestinationAppModel5.k;
                    PBModeToReachStopType modeToReachToStop2 = pBOriginDestinationAppModel5.l;
                    Intrinsics.i(routeIdsWithODPair2, "routeIdsWithODPair");
                    Intrinsics.i(fromStopId, "fromStopId");
                    Intrinsics.i(fromStopName2, "fromStopName");
                    Intrinsics.i(modeToReachFromStop2, "modeToReachFromStop");
                    Intrinsics.i(toStopId, "toStopId");
                    Intrinsics.i(toStopName2, "toStopName");
                    Intrinsics.i(modeToReachToStop2, "modeToReachToStop");
                    int i213 = i12;
                    PBOriginDestinationAppModel pBOriginDestinationAppModel6 = new PBOriginDestinationAppModel(routeIdsWithODPair2, str18, fromStopId, fromStopName2, l5, l6, modeToReachFromStop2, toStopId, toStopName2, l7, l8, modeToReachToStop2, i213, i13, z3);
                    if (arrayList3.isEmpty()) {
                        pBAvailableSlotsInfoAppModel4 = new PBAvailableSlotsInfoAppModel(fromStopId, toStopId, arrayList3);
                    } else {
                        pBAvailableSlotsInfoAppModel4 = null;
                    }
                    arrayList2.add(new ODPairWithSlotsListAppModel(pBOriginDestinationAppModel6, pBAvailableSlotsInfoAppModel4, pBAvailableSlotsInfoAppModel3));
                    i11 = i17;
                    it3 = it4;
                    linkedHashMap = linkedHashMap2;
                    i9 = i212;
                    i12 = i213;
                    pBAvailableSlotsInfoAppModel = null;
                }
                i15 = i11;
                int i214 = i9;
                int i215 = i12;
                if (arrayList2.isEmpty()) {
                    z = true;
                    break;
                }
                size2 = arrayList2.size();
                i16 = 0;
                loop5: while (true) {
                    if (i16 < size2) {
                        z = true;
                        break;
                    }
                    Object obj4 = arrayList2.get(i16);
                    i16++;
                    pBAvailableSlotsInfoAppModel2 = ((ODPairWithSlotsListAppModel) obj4).c;
                    if (pBAvailableSlotsInfoAppModel2 == null) {
                    }
                }
                if (i15 != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return new ChaloUseCaseResult.Success(new ODPairsAndRespectiveSlotsBetweenStops(arrayList2, z, i215, i13, z2, i214));
            }
        }
        return coroutineSingletons;
    }
}
