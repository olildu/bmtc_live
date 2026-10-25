package app.chalo.premiumbus.domain;

import app.chalo.extensions.DataStoreExtensionsKt$getValueAsFlow$$inlined$map$1;
import app.chalo.features.onetimeoffer.IUserPreferencesDataStore;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsAppRequestModel;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsInfoAppModel;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import app.chalo.premiumbus.data.models.app.SlotSearchRequestAppModel;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.utils.ChaloUseCaseResult;
import com.freshchat.consumer.sdk.beans.config.DefaultRefreshIntervals;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.domain.GetAvailableSlotsForODPairsUseCase", f = "GetAvailableSlotsForODPairsUseCase.kt", l = {34, 35, 57}, m = "invoke", v = 1)
final class GetAvailableSlotsForODPairsUseCase$invoke$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    long J$2;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetAvailableSlotsForODPairsUseCase this$0;

    /* JADX WARN: Code duplicated, block: B:101:0x0282  */
    /* JADX WARN: Code duplicated, block: B:122:0x02da  */
    /* JADX WARN: Code duplicated, block: B:125:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:126:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:130:0x030d  */
    /* JADX WARN: Code duplicated, block: B:132:0x0311  */
    /* JADX WARN: Code duplicated, block: B:134:0x0322  */
    /* JADX WARN: Code duplicated, block: B:136:0x0325  */
    /* JADX WARN: Code duplicated, block: B:138:0x0328  */
    /* JADX WARN: Code duplicated, block: B:140:0x032b  */
    /* JADX WARN: Code duplicated, block: B:142:0x032e  */
    /* JADX WARN: Code duplicated, block: B:144:0x0336  */
    /* JADX WARN: Code duplicated, block: B:146:0x033c  */
    /* JADX WARN: Code duplicated, block: B:148:0x0344  */
    /* JADX WARN: Code duplicated, block: B:150:0x0357  */
    /* JADX WARN: Code duplicated, block: B:152:0x035f  */
    /* JADX WARN: Code duplicated, block: B:154:0x0367  */
    /* JADX WARN: Code duplicated, block: B:176:0x0280 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x028a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x010a A[EDGE_INSN: B:182:0x010a->B:33:0x010a BREAK  A[LOOP:6: B:26:0x00d9->B:32:0x00f8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:36:0x0113  */
    /* JADX WARN: Code duplicated, block: B:40:0x012c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0133  */
    /* JADX WARN: Code duplicated, block: B:46:0x0153  */
    /* JADX WARN: Code duplicated, block: B:49:0x016b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0196 A[LOOP:2: B:55:0x0194->B:56:0x0196, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:60:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:62:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:69:0x0201  */
    /* JADX WARN: Code duplicated, block: B:72:0x020f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0232  */
    /* JADX WARN: Code duplicated, block: B:83:0x0239  */
    /* JADX WARN: Code duplicated, block: B:86:0x0240  */
    /* JADX WARN: Code duplicated, block: B:87:0x0247  */
    /* JADX WARN: Code duplicated, block: B:90:0x024f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0256  */
    /* JADX WARN: Code duplicated, block: B:94:0x0263  */
    /* JADX WARN: Code duplicated, block: B:95:0x026a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0276 A[DONT_INVERT] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j;
        String str;
        List list;
        long j2;
        long j3;
        String str2;
        long j4;
        List list2;
        long j5;
        ArrayList arrayList;
        Iterator it;
        PBAvailableSlotsInfoAppModel pBAvailableSlotsInfoAppModel;
        List list3;
        String strB;
        String str3;
        ChaloUseCaseResult chaloUseCaseResult;
        PBAvailableSlotsFetchFailedReasons pBAvailableSlotsFetchFailedReasons;
        int i;
        List list4;
        ArrayList arrayList2;
        boolean z;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int size;
        int i2;
        String fromStopId;
        String toStopId;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        int size2;
        int i3;
        List list5;
        int i4;
        int i5;
        PBAvailableSlotsInfoAppModel pBAvailableSlotsInfoAppModel2;
        PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel;
        PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel2;
        long j6;
        long j7;
        long jAbs;
        PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel3;
        boolean z2;
        PBAvailableSlotsInfoAppModel pBAvailableSlotsInfoAppModel3;
        List list6;
        PBAvailableSlotsInfoAppModel pBAvailableSlotsInfoAppModel4;
        Object objA = obj;
        this.result = objA;
        int i6 = this.label | Integer.MIN_VALUE;
        this.label = i6;
        GetAvailableSlotsForODPairsUseCase getAvailableSlotsForODPairsUseCase = this.this$0;
        CityProvider cityProvider = getAvailableSlotsForODPairsUseCase.b;
        IUserPreferencesDataStore iUserPreferencesDataStore = getAvailableSlotsForODPairsUseCase.c;
        int i7 = i6 - Integer.MIN_VALUE;
        this.label = i7;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i7 == 0) {
            ResultKt.b(objA);
            String strM = getAvailableSlotsForODPairsUseCase.d.m();
            if (strM == null) {
                return new ChaloUseCaseResult.Failure(ODPairAndSlotsFetchFailedReasons.UserNotFound.f7214a);
            }
            DataStoreExtensionsKt$getValueAsFlow$$inlined$map$1 dataStoreExtensionsKt$getValueAsFlow$$inlined$map$1D = iUserPreferencesDataStore.d();
            this.L$0 = null;
            this.L$1 = strM;
            j = 0;
            this.J$0 = 0L;
            this.J$1 = 0L;
            this.J$2 = 0L;
            this.label = 1;
            Object objV = FlowKt.v(dataStoreExtensionsKt$getValueAsFlow$$inlined$map$1D, this);
            if (objV != coroutineSingletons) {
                str = strM;
                objA = objV;
                list = null;
                j2 = 0;
                j3 = 0;
            }
            return coroutineSingletons;
        }
        if (i7 == 1) {
            long j8 = this.J$2;
            long j9 = this.J$1;
            j = this.J$0;
            str = (String) this.L$1;
            list = (List) this.L$0;
            ResultKt.b(objA);
            j3 = j8;
            j2 = j9;
        } else {
            if (i7 == 2) {
                j3 = this.J$2;
                long j10 = this.J$1;
                long j11 = this.J$0;
                String str4 = (String) this.L$2;
                str = (String) this.L$1;
                list = (List) this.L$0;
                ResultKt.b(objA);
                str2 = str4;
                j4 = j10;
                j = j11;
                list2 = list;
                j5 = j3;
                String str5 = str;
                String str6 = (String) objA;
                List list7 = list2;
                arrayList = new ArrayList(CollectionsKt.v(list7, 10));
                it = list7.iterator();
                while (true) {
                    if (it.hasNext()) {
                        break;
                    }
                    PBOriginDestinationAppModel pBOriginDestinationAppModel = (PBOriginDestinationAppModel) it.next();
                    List list8 = pBOriginDestinationAppModel.f7091a;
                    String str7 = pBOriginDestinationAppModel.c;
                    String str8 = pBOriginDestinationAppModel.h;
                    strB = CityProviderKt.b(cityProvider);
                    if (strB == null) {
                        str3 = "";
                    } else {
                        str3 = strB;
                    }
                    arrayList.add(new SlotSearchRequestAppModel(str7, str8, j4, j5, str3, list8));
                }
                String strB2 = CityProviderKt.b(cityProvider);
                PBAvailableSlotsAppRequestModel pBAvailableSlotsAppRequestModel = new PBAvailableSlotsAppRequestModel(str5, str6, str2, strB2 != null ? strB2 : "", arrayList);
                FetchPBAvailableSlotsUseCase fetchPBAvailableSlotsUseCase = getAvailableSlotsForODPairsUseCase.f7200a;
                this.L$0 = list2;
                pBAvailableSlotsInfoAppModel = null;
                this.L$1 = null;
                this.L$2 = null;
                this.J$0 = j;
                this.label = 3;
                objA = fetchPBAvailableSlotsUseCase.a(pBAvailableSlotsAppRequestModel, this);
                if (objA != coroutineSingletons) {
                    list3 = list2;
                }
                return coroutineSingletons;
            }
            if (i7 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j12 = this.J$0;
            list3 = (List) this.L$0;
            ResultKt.b(objA);
            j = j12;
            pBAvailableSlotsInfoAppModel = null;
        }
        chaloUseCaseResult = (ChaloUseCaseResult) objA;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                throw new NoWhenBranchMatchedException();
            }
            pBAvailableSlotsFetchFailedReasons = (PBAvailableSlotsFetchFailedReasons) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
            i = GetAvailableSlotsForODPairsUseCase.WhenMappings.f7201a[pBAvailableSlotsFetchFailedReasons.ordinal()];
            if (i != 1) {
                return new ChaloUseCaseResult.Failure(ODPairAndSlotsFetchFailedReasons.InvalidWindow.f7208a);
            }
            if (i != 2) {
                return new ChaloUseCaseResult.Failure(ODPairAndSlotsFetchFailedReasons.LocalException.f7209a);
            }
            if (i != 3) {
                return new ChaloUseCaseResult.Failure(new ODPairAndSlotsFetchFailedReasons.ServerError(String.valueOf(pBAvailableSlotsFetchFailedReasons.getErrorCodes())));
            }
            if (i != 4) {
                return new ChaloUseCaseResult.Failure(ODPairAndSlotsFetchFailedReasons.ResponseParseException.f7211a);
            }
            if (i == 5) {
                return new ChaloUseCaseResult.Failure(ODPairAndSlotsFetchFailedReasons.UnknownException.f7213a);
            }
            throw new NoWhenBranchMatchedException();
        }
        list4 = (List) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
        List<PBOriginDestinationAppModel> list9 = list3;
        arrayList2 = new ArrayList(CollectionsKt.v(list9, 10));
        z = true;
        for (PBOriginDestinationAppModel pBOriginDestinationAppModel2 : list9) {
            arrayList3 = new ArrayList();
            for (Object obj2 : list4) {
                pBAvailableSlotsInfoAppModel4 = (PBAvailableSlotsInfoAppModel) obj2;
                if (!Intrinsics.d(pBOriginDestinationAppModel2.c, pBAvailableSlotsInfoAppModel4.f7087a) && Intrinsics.d(pBOriginDestinationAppModel2.h, pBAvailableSlotsInfoAppModel4.b)) {
                    arrayList3.add(obj2);
                }
            }
            arrayList4 = new ArrayList();
            size = arrayList3.size();
            i2 = 0;
            while (i2 < size) {
                Object obj3 = arrayList3.get(i2);
                i2++;
                CollectionsKt.i(((PBAvailableSlotsInfoAppModel) obj3).c, arrayList4);
            }
            fromStopId = pBOriginDestinationAppModel2.c;
            toStopId = pBOriginDestinationAppModel2.h;
            Intrinsics.i(fromStopId, "fromStopId");
            Intrinsics.i(toStopId, "toStopId");
            if (arrayList4.isEmpty()) {
                list5 = list4;
                pBAvailableSlotsInfoAppModel2 = pBAvailableSlotsInfoAppModel;
            } else {
                arrayList5 = new ArrayList();
                arrayList6 = new ArrayList();
                arrayList7 = new ArrayList();
                size2 = arrayList4.size();
                i3 = 0;
                while (i3 < size2) {
                    Object obj4 = arrayList4.get(i3);
                    i3++;
                    pBAvailableSlotsTripAppModel3 = (PBAvailableSlotsTripAppModel) obj4;
                    List list10 = list4;
                    int i8 = size2;
                    if (pBAvailableSlotsTripAppModel3.g <= j) {
                        arrayList6.add(pBAvailableSlotsTripAppModel3);
                    } else {
                        arrayList7.add(pBAvailableSlotsTripAppModel3);
                    }
                    list4 = list10;
                    size2 = i8;
                }
                list5 = list4;
                if (arrayList7.size() > 1) {
                    CollectionsKt.t0(arrayList7, new GetAvailableSlotsForODPairsUseCase$filterHighlightedSlots$$inlined$sortBy$1());
                }
                if (arrayList6.size() > 1) {
                    CollectionsKt.t0(arrayList6, new GetAvailableSlotsForODPairsUseCase$filterHighlightedSlots$$inlined$sortByDescending$1());
                }
                i4 = 0;
                i5 = 0;
                while (arrayList5.size() < 3 && (i4 < arrayList7.size() || i5 < arrayList6.size())) {
                    if (i4 < arrayList7.size()) {
                        pBAvailableSlotsTripAppModel = (PBAvailableSlotsTripAppModel) arrayList7.get(i4);
                    } else {
                        pBAvailableSlotsTripAppModel = null;
                    }
                    if (i5 < arrayList6.size()) {
                        pBAvailableSlotsTripAppModel2 = (PBAvailableSlotsTripAppModel) arrayList6.get(i5);
                    } else {
                        pBAvailableSlotsTripAppModel2 = null;
                    }
                    j6 = Long.MAX_VALUE;
                    if (pBAvailableSlotsTripAppModel2 != null) {
                        j7 = pBAvailableSlotsTripAppModel2.g;
                    } else {
                        j7 = Long.MAX_VALUE;
                    }
                    jAbs = Math.abs(j7 - j);
                    if (pBAvailableSlotsTripAppModel != null) {
                        j6 = pBAvailableSlotsTripAppModel.g;
                    }
                    if (jAbs < Math.abs(j6 - j)) {
                        if (pBAvailableSlotsTripAppModel != null) {
                            arrayList5.add(pBAvailableSlotsTripAppModel);
                            i4++;
                        }
                        i5 = i5;
                    } else if (pBAvailableSlotsTripAppModel2 != null) {
                        arrayList5.add(pBAvailableSlotsTripAppModel2);
                        i5++;
                        i4 = i4;
                    }
                    i4 = i4;
                    i5 = i5;
                }
                pBAvailableSlotsInfoAppModel2 = new PBAvailableSlotsInfoAppModel(fromStopId, toStopId, CollectionsKt.v0(new GetAvailableSlotsForODPairsUseCase$filterHighlightedSlots$$inlined$sortedBy$1(), arrayList5));
            }
            if (pBAvailableSlotsInfoAppModel2 != null || (list6 = pBAvailableSlotsInfoAppModel2.c) == null) {
                z2 = true;
            } else {
                List list11 = list6;
                if (!(list11 instanceof Collection) || !list11.isEmpty()) {
                    Iterator it2 = list11.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel4 = (PBAvailableSlotsTripAppModel) it2.next();
                            long j13 = j - 1800000;
                            long j14 = j + DefaultRefreshIntervals.REMOTE_CONFIG_FETCH_INTERVAL;
                            Iterator it3 = it2;
                            long j15 = pBAvailableSlotsTripAppModel4.g;
                            if (j13 > j15 || j15 > j14) {
                                it2 = it3;
                            } else {
                                z2 = true;
                            }
                        }
                    }
                }
                z2 = false;
            }
            if (arrayList4.isEmpty()) {
                pBAvailableSlotsInfoAppModel3 = null;
            } else {
                pBAvailableSlotsInfoAppModel3 = new PBAvailableSlotsInfoAppModel(pBOriginDestinationAppModel2.c, toStopId, arrayList4);
            }
            arrayList2.add(new ODPairWithSlotsListAppModel(pBOriginDestinationAppModel2, pBAvailableSlotsInfoAppModel3, pBAvailableSlotsInfoAppModel2));
            z = z2;
            list4 = list5;
            pBAvailableSlotsInfoAppModel = null;
        }
        return new ChaloUseCaseResult.Success(new ODPairsAndRespectiveSlotsBetweenStops(0, 0, 0, 60, arrayList2, !z));
        String str9 = (String) objA;
        DataStoreExtensionsKt$getValueAsFlow$$inlined$map$1 dataStoreExtensionsKt$getValueAsFlow$$inlined$map$1B = iUserPreferencesDataStore.b();
        this.L$0 = list;
        this.L$1 = str;
        this.L$2 = str9;
        this.J$0 = j;
        this.J$1 = j2;
        this.J$2 = j3;
        this.label = 2;
        Object objV2 = FlowKt.v(dataStoreExtensionsKt$getValueAsFlow$$inlined$map$1B, this);
        if (objV2 != coroutineSingletons) {
            str2 = str9;
            objA = objV2;
            j4 = j2;
            list2 = list;
            j5 = j3;
            String str10 = str;
            String str11 = (String) objA;
            List list12 = list2;
            arrayList = new ArrayList(CollectionsKt.v(list12, 10));
            it = list12.iterator();
            while (true) {
                if (it.hasNext()) {
                    break;
                    break;
                }
                PBOriginDestinationAppModel pBOriginDestinationAppModel3 = (PBOriginDestinationAppModel) it.next();
                List list13 = pBOriginDestinationAppModel3.f7091a;
                String str12 = pBOriginDestinationAppModel3.c;
                String str13 = pBOriginDestinationAppModel3.h;
                strB = CityProviderKt.b(cityProvider);
                if (strB == null) {
                    str3 = "";
                } else {
                    str3 = strB;
                }
                arrayList.add(new SlotSearchRequestAppModel(str12, str13, j4, j5, str3, list13));
            }
            String strB3 = CityProviderKt.b(cityProvider);
            PBAvailableSlotsAppRequestModel pBAvailableSlotsAppRequestModel2 = new PBAvailableSlotsAppRequestModel(str10, str11, str2, strB3 != null ? strB3 : "", arrayList);
            FetchPBAvailableSlotsUseCase fetchPBAvailableSlotsUseCase2 = getAvailableSlotsForODPairsUseCase.f7200a;
            this.L$0 = list2;
            pBAvailableSlotsInfoAppModel = null;
            this.L$1 = null;
            this.L$2 = null;
            this.J$0 = j;
            this.label = 3;
            objA = fetchPBAvailableSlotsUseCase2.a(pBAvailableSlotsAppRequestModel2, this);
            if (objA != coroutineSingletons) {
                list3 = list2;
                chaloUseCaseResult = (ChaloUseCaseResult) objA;
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pBAvailableSlotsFetchFailedReasons = (PBAvailableSlotsFetchFailedReasons) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
                    i = GetAvailableSlotsForODPairsUseCase.WhenMappings.f7201a[pBAvailableSlotsFetchFailedReasons.ordinal()];
                    if (i != 1) {
                        return new ChaloUseCaseResult.Failure(ODPairAndSlotsFetchFailedReasons.InvalidWindow.f7208a);
                    }
                    if (i != 2) {
                        return new ChaloUseCaseResult.Failure(ODPairAndSlotsFetchFailedReasons.LocalException.f7209a);
                    }
                    if (i != 3) {
                        return new ChaloUseCaseResult.Failure(new ODPairAndSlotsFetchFailedReasons.ServerError(String.valueOf(pBAvailableSlotsFetchFailedReasons.getErrorCodes())));
                    }
                    if (i != 4) {
                        return new ChaloUseCaseResult.Failure(ODPairAndSlotsFetchFailedReasons.ResponseParseException.f7211a);
                    }
                    if (i == 5) {
                        return new ChaloUseCaseResult.Failure(ODPairAndSlotsFetchFailedReasons.UnknownException.f7213a);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                list4 = (List) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                List<PBOriginDestinationAppModel> list14 = list3;
                arrayList2 = new ArrayList(CollectionsKt.v(list14, 10));
                z = true;
                while (r4.hasNext()) {
                    arrayList3 = new ArrayList();
                    while (r6.hasNext()) {
                        pBAvailableSlotsInfoAppModel4 = (PBAvailableSlotsInfoAppModel) obj2;
                        if (!Intrinsics.d(pBOriginDestinationAppModel2.c, pBAvailableSlotsInfoAppModel4.f7087a)) {
                        }
                    }
                    arrayList4 = new ArrayList();
                    size = arrayList3.size();
                    i2 = 0;
                    while (i2 < size) {
                        Object obj5 = arrayList3.get(i2);
                        i2++;
                        CollectionsKt.i(((PBAvailableSlotsInfoAppModel) obj5).c, arrayList4);
                    }
                    fromStopId = pBOriginDestinationAppModel2.c;
                    toStopId = pBOriginDestinationAppModel2.h;
                    Intrinsics.i(fromStopId, "fromStopId");
                    Intrinsics.i(toStopId, "toStopId");
                    if (arrayList4.isEmpty()) {
                        list5 = list4;
                        pBAvailableSlotsInfoAppModel2 = pBAvailableSlotsInfoAppModel;
                    } else {
                        arrayList5 = new ArrayList();
                        arrayList6 = new ArrayList();
                        arrayList7 = new ArrayList();
                        size2 = arrayList4.size();
                        i3 = 0;
                        while (i3 < size2) {
                            Object obj6 = arrayList4.get(i3);
                            i3++;
                            pBAvailableSlotsTripAppModel3 = (PBAvailableSlotsTripAppModel) obj6;
                            List list15 = list4;
                            int i9 = size2;
                            if (pBAvailableSlotsTripAppModel3.g <= j) {
                                arrayList6.add(pBAvailableSlotsTripAppModel3);
                            } else {
                                arrayList7.add(pBAvailableSlotsTripAppModel3);
                            }
                            list4 = list15;
                            size2 = i9;
                        }
                        list5 = list4;
                        if (arrayList7.size() > 1) {
                            CollectionsKt.t0(arrayList7, new GetAvailableSlotsForODPairsUseCase$filterHighlightedSlots$$inlined$sortBy$1());
                        }
                        if (arrayList6.size() > 1) {
                            CollectionsKt.t0(arrayList6, new GetAvailableSlotsForODPairsUseCase$filterHighlightedSlots$$inlined$sortByDescending$1());
                        }
                        i4 = 0;
                        i5 = 0;
                        while (arrayList5.size() < 3) {
                            if (i4 < arrayList7.size()) {
                                pBAvailableSlotsTripAppModel = (PBAvailableSlotsTripAppModel) arrayList7.get(i4);
                            } else {
                                pBAvailableSlotsTripAppModel = null;
                            }
                            if (i5 < arrayList6.size()) {
                                pBAvailableSlotsTripAppModel2 = (PBAvailableSlotsTripAppModel) arrayList6.get(i5);
                            } else {
                                pBAvailableSlotsTripAppModel2 = null;
                            }
                            j6 = Long.MAX_VALUE;
                            if (pBAvailableSlotsTripAppModel2 != null) {
                                j7 = pBAvailableSlotsTripAppModel2.g;
                            } else {
                                j7 = Long.MAX_VALUE;
                            }
                            jAbs = Math.abs(j7 - j);
                            if (pBAvailableSlotsTripAppModel != null) {
                                j6 = pBAvailableSlotsTripAppModel.g;
                            }
                            if (jAbs < Math.abs(j6 - j)) {
                                if (pBAvailableSlotsTripAppModel != null) {
                                    arrayList5.add(pBAvailableSlotsTripAppModel);
                                    i4++;
                                }
                                i5 = i5;
                            } else if (pBAvailableSlotsTripAppModel2 != null) {
                                arrayList5.add(pBAvailableSlotsTripAppModel2);
                                i5++;
                                i4 = i4;
                            }
                            i4 = i4;
                            i5 = i5;
                        }
                        pBAvailableSlotsInfoAppModel2 = new PBAvailableSlotsInfoAppModel(fromStopId, toStopId, CollectionsKt.v0(new GetAvailableSlotsForODPairsUseCase$filterHighlightedSlots$$inlined$sortedBy$1(), arrayList5));
                    }
                    if (pBAvailableSlotsInfoAppModel2 != null) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (arrayList4.isEmpty()) {
                        pBAvailableSlotsInfoAppModel3 = new PBAvailableSlotsInfoAppModel(pBOriginDestinationAppModel2.c, toStopId, arrayList4);
                    } else {
                        pBAvailableSlotsInfoAppModel3 = null;
                    }
                    arrayList2.add(new ODPairWithSlotsListAppModel(pBOriginDestinationAppModel2, pBAvailableSlotsInfoAppModel3, pBAvailableSlotsInfoAppModel2));
                    z = z2;
                    list4 = list5;
                    pBAvailableSlotsInfoAppModel = null;
                }
                return new ChaloUseCaseResult.Success(new ODPairsAndRespectiveSlotsBetweenStops(0, 0, 0, 60, arrayList2, !z));
            }
        }
        return coroutineSingletons;
    }
}
