package app.chalo.premiumbus.domain;

import androidx.compose.material3.internal.CalendarModelKt;
import app.chalo.premiumbus.ui.slotselection.PBODPairWithSlotSectionListUiModel;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.usecase.ChaloCustomDateFormat;
import app.chalo.usecase.CheckIsTimestampForTodayUseCase;
import app.chalo.usecase.FormatTimeInMillisToGivenFormatUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/SlotSelectionSectionInfoManager;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SlotSelectionSectionInfoManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetAvailableSlotsForODPairsPaginatedUseCase f7259a;
    public final CheckIsTimestampForTodayUseCase b;
    public final StringProvider c;
    public final FormatTimeInMillisToGivenFormatUseCase d;
    public final LinkedHashMap e = new LinkedHashMap();
    public final MutexImpl f = MutexKt.a();

    public SlotSelectionSectionInfoManager(GetAvailableSlotsForODPairsPaginatedUseCase getAvailableSlotsForODPairsPaginatedUseCase, CheckIsTimestampForTodayUseCase checkIsTimestampForTodayUseCase, StringProvider stringProvider, FormatTimeInMillisToGivenFormatUseCase formatTimeInMillisToGivenFormatUseCase) {
        this.f7259a = getAvailableSlotsForODPairsPaginatedUseCase;
        this.b = checkIsTimestampForTodayUseCase;
        this.c = stringProvider;
        this.d = formatTimeInMillisToGivenFormatUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, ContinuationImpl continuationImpl) {
        SlotSelectionSectionInfoManager$clearSectionCache$1 slotSelectionSectionInfoManager$clearSectionCache$1;
        Mutex mutex;
        if (continuationImpl instanceof SlotSelectionSectionInfoManager$clearSectionCache$1) {
            slotSelectionSectionInfoManager$clearSectionCache$1 = (SlotSelectionSectionInfoManager$clearSectionCache$1) continuationImpl;
            int i = slotSelectionSectionInfoManager$clearSectionCache$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                slotSelectionSectionInfoManager$clearSectionCache$1.label = i - Integer.MIN_VALUE;
            } else {
                slotSelectionSectionInfoManager$clearSectionCache$1 = new SlotSelectionSectionInfoManager$clearSectionCache$1(this, continuationImpl);
            }
        } else {
            slotSelectionSectionInfoManager$clearSectionCache$1 = new SlotSelectionSectionInfoManager$clearSectionCache$1(this, continuationImpl);
        }
        Object obj = slotSelectionSectionInfoManager$clearSectionCache$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = slotSelectionSectionInfoManager$clearSectionCache$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            MutexImpl mutexImpl = this.f;
            slotSelectionSectionInfoManager$clearSectionCache$1.L$0 = mutexImpl;
            slotSelectionSectionInfoManager$clearSectionCache$1.J$0 = j;
            slotSelectionSectionInfoManager$clearSectionCache$1.label = 1;
            if (mutexImpl.a(slotSelectionSectionInfoManager$clearSectionCache$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            mutex = mutexImpl;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = slotSelectionSectionInfoManager$clearSectionCache$1.J$0;
            mutex = (Mutex) slotSelectionSectionInfoManager$clearSectionCache$1.L$0;
            ResultKt.b(obj);
        }
        try {
            return Unit.f17538a;
        } finally {
            mutex.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x029b  */
    /* JADX WARN: Code duplicated, block: B:104:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:106:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0161  */
    /* JADX WARN: Code duplicated, block: B:48:0x0191  */
    /* JADX WARN: Code duplicated, block: B:53:0x01a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:55:0x01ab A[Catch: all -> 0x01b4, TryCatch #2 {all -> 0x01b4, blocks: (B:51:0x019f, B:65:0x01c9, B:55:0x01ab, B:57:0x01af, B:64:0x01bb, B:63:0x01b9), top: B:115:0x019f }] */
    /* JADX WARN: Code duplicated, block: B:57:0x01af A[Catch: all -> 0x01b4, TryCatch #2 {all -> 0x01b4, blocks: (B:51:0x019f, B:65:0x01c9, B:55:0x01ab, B:57:0x01af, B:64:0x01bb, B:63:0x01b9), top: B:115:0x019f }] */
    /* JADX WARN: Code duplicated, block: B:63:0x01b9 A[Catch: all -> 0x01b4, TryCatch #2 {all -> 0x01b4, blocks: (B:51:0x019f, B:65:0x01c9, B:55:0x01ab, B:57:0x01af, B:64:0x01bb, B:63:0x01b9), top: B:115:0x019f }] */
    /* JADX WARN: Code duplicated, block: B:67:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:76:0x022b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x0264  */
    /* JADX WARN: Code duplicated, block: B:82:0x0266 A[Catch: all -> 0x026f, TryCatch #6 {all -> 0x026f, blocks: (B:77:0x0238, B:78:0x0256, B:82:0x0266, B:84:0x026a, B:90:0x0274, B:89:0x0272), top: B:123:0x0238 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0272 A[Catch: all -> 0x026f, TryCatch #6 {all -> 0x026f, blocks: (B:77:0x0238, B:78:0x0256, B:82:0x0266, B:84:0x026a, B:90:0x0274, B:89:0x0272), top: B:123:0x0238 }] */
    public final Object b(long j, long j2, List list, long j3, long j4, int i, int i2, ContinuationImpl continuationImpl) throws Throwable {
        SlotSelectionSectionInfoManager$getODPairsForSectionPaginated$1 slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1;
        int i3;
        long j5;
        long j6;
        long j7;
        long j8;
        List list2;
        int i4;
        Mutex mutex;
        long j9;
        ChaloUseCaseResult chaloUseCaseResult;
        ODPairsAndRespectiveSlotsBetweenStops oDPairsAndRespectiveSlotsBetweenStopsA;
        long j10;
        long j11;
        long j12;
        ODPairsAndRespectiveSlotsBetweenStops oDPairsAndRespectiveSlotsBetweenStopsA2;
        Mutex mutex2;
        LinkedHashMap linkedHashMap;
        PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel;
        LinkedHashMap linkedHashMap2;
        String strA;
        String str;
        ODPairsAndRespectiveSlotsBetweenStops oDPairsAndRespectiveSlotsBetweenStops;
        long j13;
        long j14;
        PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel2;
        ODPairsAndRespectiveSlotsBetweenStops oDPairsAndRespectiveSlotsBetweenStops2;
        Collection collection;
        ODPairsAndRespectiveSlotsBetweenStops oDPairsAndRespectiveSlotsBetweenStopsA3;
        PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModelA;
        Collection collection2;
        ODPairsAndRespectiveSlotsBetweenStops oDPairsAndRespectiveSlotsBetweenStops3;
        if (continuationImpl instanceof SlotSelectionSectionInfoManager$getODPairsForSectionPaginated$1) {
            slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1 = (SlotSelectionSectionInfoManager$getODPairsForSectionPaginated$1) continuationImpl;
            int i5 = slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.label = i5 - Integer.MIN_VALUE;
            } else {
                slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1 = new SlotSelectionSectionInfoManager$getODPairsForSectionPaginated$1(this, continuationImpl);
            }
        } else {
            slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1 = new SlotSelectionSectionInfoManager$getODPairsForSectionPaginated$1(this, continuationImpl);
        }
        Object objA = slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.label;
        Mutex mutex3 = this.f;
        LinkedHashMap linkedHashMap3 = this.e;
        try {
            if (i6 == 0) {
                ResultKt.b(objA);
                long j15 = j3 + j;
                slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.L$0 = list;
                slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.L$1 = mutex3;
                slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$0 = j2;
                slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$1 = j3;
                slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$2 = j4;
                i3 = i;
                slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.I$0 = i3;
                slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.I$1 = i2;
                slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$3 = j15;
                slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.label = 1;
                if (mutex3.a(slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1) != coroutineSingletons) {
                    j5 = j3;
                    j6 = j15;
                    j7 = j2;
                    j8 = j4;
                    list2 = list;
                    i4 = i2;
                    mutex = mutex3;
                }
                return coroutineSingletons;
            }
            if (i6 != 1) {
                if (i6 == 2) {
                    j6 = slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$3;
                    i3 = slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.I$0;
                    j8 = slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$2;
                    j5 = slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$1;
                    j9 = slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$0;
                    ResultKt.b(objA);
                    chaloUseCaseResult = (ChaloUseCaseResult) objA;
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                            return new ChaloUseCaseResult.Failure(((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    ODPairsAndRespectiveSlotsBetweenStops oDPairsAndRespectiveSlotsBetweenStops4 = (ODPairsAndRespectiveSlotsBetweenStops) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                    oDPairsAndRespectiveSlotsBetweenStopsA = ODPairsAndRespectiveSlotsBetweenStops.a(oDPairsAndRespectiveSlotsBetweenStops4, CollectionsKt.v0(new SlotSelectionSectionInfoManager$sortOdPairsWithSlots$$inlined$sortedByDescending$1(), oDPairsAndRespectiveSlotsBetweenStops4.f7216a));
                    slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.L$0 = oDPairsAndRespectiveSlotsBetweenStopsA;
                    slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.L$1 = mutex3;
                    slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$0 = j9;
                    slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$1 = j5;
                    slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$2 = j8;
                    slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.I$0 = i3;
                    slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$3 = j6;
                    slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.label = 3;
                    if (mutex3.a(slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1) != coroutineSingletons) {
                        long j16 = j5;
                        j10 = j9;
                        j11 = j8;
                        j12 = j16;
                        oDPairsAndRespectiveSlotsBetweenStopsA2 = oDPairsAndRespectiveSlotsBetweenStopsA;
                        linkedHashMap = linkedHashMap3;
                        pBODPairWithSlotSectionListUiModel = (PBODPairWithSlotSectionListUiModel) linkedHashMap.get(new Long(j10));
                        if (pBODPairWithSlotSectionListUiModel != null) {
                            if (i3 == 0) {
                                oDPairsAndRespectiveSlotsBetweenStopsA3 = oDPairsAndRespectiveSlotsBetweenStopsA2;
                            } else {
                                oDPairsAndRespectiveSlotsBetweenStops2 = pBODPairWithSlotSectionListUiModel.c;
                                if (oDPairsAndRespectiveSlotsBetweenStops2 != null) {
                                    collection = EmptyList.f17557a;
                                } else {
                                    collection = EmptyList.f17557a;
                                }
                                oDPairsAndRespectiveSlotsBetweenStopsA3 = ODPairsAndRespectiveSlotsBetweenStops.a(oDPairsAndRespectiveSlotsBetweenStopsA2, CollectionsKt.c0(oDPairsAndRespectiveSlotsBetweenStopsA2.f7216a, collection));
                            }
                            pBODPairWithSlotSectionListUiModelA = PBODPairWithSlotSectionListUiModel.a(pBODPairWithSlotSectionListUiModel, oDPairsAndRespectiveSlotsBetweenStopsA3, new Long(j6), false, 0, 0, false, false, 16347);
                            pBODPairWithSlotSectionListUiModel2 = pBODPairWithSlotSectionListUiModel;
                            mutex2 = mutex3;
                            linkedHashMap2 = linkedHashMap;
                        } else {
                            linkedHashMap2 = linkedHashMap;
                            strA = FormatTimeInMillisToGivenFormatUseCase.a(this.d, j10, ChaloCustomDateFormat.DAY_NAME_WITH_DATE_FORMAT, 12);
                            slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.L$0 = oDPairsAndRespectiveSlotsBetweenStopsA2;
                            slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.L$1 = mutex3;
                            slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.L$2 = pBODPairWithSlotSectionListUiModel;
                            slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.L$3 = strA;
                            slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$0 = j10;
                            slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$1 = j12;
                            slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$2 = j11;
                            slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.I$0 = i3;
                            slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$3 = j6;
                            slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.label = 4;
                            objA = this.b.a(j10 - CalendarModelKt.MillisecondsIn24Hours, slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1);
                            if (objA == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            str = strA;
                            oDPairsAndRespectiveSlotsBetweenStops = oDPairsAndRespectiveSlotsBetweenStopsA2;
                            j13 = j11;
                            j14 = j12;
                            pBODPairWithSlotSectionListUiModel2 = pBODPairWithSlotSectionListUiModel;
                            mutex2 = mutex3;
                            long j17 = j10;
                            pBODPairWithSlotSectionListUiModelA = new PBODPairWithSlotSectionListUiModel(j17, str, oDPairsAndRespectiveSlotsBetweenStops, j14, j13, new Long(j6), !((Boolean) objA).booleanValue(), 16128);
                            j10 = j17;
                            oDPairsAndRespectiveSlotsBetweenStopsA2 = oDPairsAndRespectiveSlotsBetweenStops;
                        }
                        linkedHashMap2.put(new Long(j10), pBODPairWithSlotSectionListUiModelA);
                        if (i3 != 0) {
                            if (pBODPairWithSlotSectionListUiModel2 != null) {
                                collection2 = EmptyList.f17557a;
                            } else {
                                collection2 = EmptyList.f17557a;
                            }
                            oDPairsAndRespectiveSlotsBetweenStopsA2 = ODPairsAndRespectiveSlotsBetweenStops.a(oDPairsAndRespectiveSlotsBetweenStopsA2, CollectionsKt.c0(oDPairsAndRespectiveSlotsBetweenStopsA2.f7216a, collection2));
                        }
                        mutex2.e(null);
                        return new ChaloUseCaseResult.Success(oDPairsAndRespectiveSlotsBetweenStopsA2);
                    }
                    return coroutineSingletons;
                }
                if (i6 != 3) {
                    if (i6 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j6 = slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$3;
                    int i7 = slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.I$0;
                    long j18 = slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$2;
                    long j19 = slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$1;
                    j10 = slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$0;
                    String str2 = (String) slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.L$3;
                    pBODPairWithSlotSectionListUiModel2 = (PBODPairWithSlotSectionListUiModel) slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.L$2;
                    mutex2 = (Mutex) slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.L$1;
                    ODPairsAndRespectiveSlotsBetweenStops oDPairsAndRespectiveSlotsBetweenStops5 = (ODPairsAndRespectiveSlotsBetweenStops) slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.L$0;
                    try {
                        ResultKt.b(objA);
                        oDPairsAndRespectiveSlotsBetweenStops = oDPairsAndRespectiveSlotsBetweenStops5;
                        j13 = j18;
                        j14 = j19;
                        str = str2;
                        linkedHashMap2 = linkedHashMap3;
                        i3 = i7;
                        long j110 = j10;
                        try {
                            pBODPairWithSlotSectionListUiModelA = new PBODPairWithSlotSectionListUiModel(j110, str, oDPairsAndRespectiveSlotsBetweenStops, j14, j13, new Long(j6), !((Boolean) objA).booleanValue(), 16128);
                            j10 = j110;
                            oDPairsAndRespectiveSlotsBetweenStopsA2 = oDPairsAndRespectiveSlotsBetweenStops;
                            linkedHashMap2.put(new Long(j10), pBODPairWithSlotSectionListUiModelA);
                            if (i3 != 0) {
                                if (pBODPairWithSlotSectionListUiModel2 != null || (oDPairsAndRespectiveSlotsBetweenStops3 = pBODPairWithSlotSectionListUiModel2.c) == null || (collection2 = oDPairsAndRespectiveSlotsBetweenStops3.f7216a) == null) {
                                    collection2 = EmptyList.f17557a;
                                }
                                oDPairsAndRespectiveSlotsBetweenStopsA2 = ODPairsAndRespectiveSlotsBetweenStops.a(oDPairsAndRespectiveSlotsBetweenStopsA2, CollectionsKt.c0(oDPairsAndRespectiveSlotsBetweenStopsA2.f7216a, collection2));
                            }
                            mutex2.e(null);
                            return new ChaloUseCaseResult.Success(oDPairsAndRespectiveSlotsBetweenStopsA2);
                        } catch (Throwable th) {
                            th = th;
                            mutex2.e(null);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        mutex2.e(null);
                        throw th;
                    }
                }
                j6 = slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$3;
                i3 = slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.I$0;
                j11 = slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$2;
                j12 = slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$1;
                j10 = slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$0;
                mutex3 = (Mutex) slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.L$1;
                oDPairsAndRespectiveSlotsBetweenStopsA2 = (ODPairsAndRespectiveSlotsBetweenStops) slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.L$0;
                ResultKt.b(objA);
                linkedHashMap3 = linkedHashMap3;
                linkedHashMap = linkedHashMap3;
                try {
                    pBODPairWithSlotSectionListUiModel = (PBODPairWithSlotSectionListUiModel) linkedHashMap.get(new Long(j10));
                    if (pBODPairWithSlotSectionListUiModel != null) {
                        if (i3 == 0) {
                            oDPairsAndRespectiveSlotsBetweenStopsA3 = oDPairsAndRespectiveSlotsBetweenStopsA2;
                        } else {
                            oDPairsAndRespectiveSlotsBetweenStops2 = pBODPairWithSlotSectionListUiModel.c;
                            if (oDPairsAndRespectiveSlotsBetweenStops2 != null || (collection = oDPairsAndRespectiveSlotsBetweenStops2.f7216a) == null) {
                                collection = EmptyList.f17557a;
                            }
                            oDPairsAndRespectiveSlotsBetweenStopsA3 = ODPairsAndRespectiveSlotsBetweenStops.a(oDPairsAndRespectiveSlotsBetweenStopsA2, CollectionsKt.c0(oDPairsAndRespectiveSlotsBetweenStopsA2.f7216a, collection));
                        }
                        pBODPairWithSlotSectionListUiModelA = PBODPairWithSlotSectionListUiModel.a(pBODPairWithSlotSectionListUiModel, oDPairsAndRespectiveSlotsBetweenStopsA3, new Long(j6), false, 0, 0, false, false, 16347);
                        pBODPairWithSlotSectionListUiModel2 = pBODPairWithSlotSectionListUiModel;
                        mutex2 = mutex3;
                        linkedHashMap2 = linkedHashMap;
                    } else {
                        linkedHashMap2 = linkedHashMap;
                        try {
                            strA = FormatTimeInMillisToGivenFormatUseCase.a(this.d, j10, ChaloCustomDateFormat.DAY_NAME_WITH_DATE_FORMAT, 12);
                            slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.L$0 = oDPairsAndRespectiveSlotsBetweenStopsA2;
                            slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.L$1 = mutex3;
                            slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.L$2 = pBODPairWithSlotSectionListUiModel;
                            slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.L$3 = strA;
                            slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$0 = j10;
                            slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$1 = j12;
                            slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$2 = j11;
                            slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.I$0 = i3;
                            slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$3 = j6;
                            slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.label = 4;
                            try {
                                objA = this.b.a(j10 - CalendarModelKt.MillisecondsIn24Hours, slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1);
                                if (objA == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                str = strA;
                                oDPairsAndRespectiveSlotsBetweenStops = oDPairsAndRespectiveSlotsBetweenStopsA2;
                                j13 = j11;
                                j14 = j12;
                                pBODPairWithSlotSectionListUiModel2 = pBODPairWithSlotSectionListUiModel;
                                mutex2 = mutex3;
                                long j111 = j10;
                                pBODPairWithSlotSectionListUiModelA = new PBODPairWithSlotSectionListUiModel(j111, str, oDPairsAndRespectiveSlotsBetweenStops, j14, j13, new Long(j6), !((Boolean) objA).booleanValue(), 16128);
                                j10 = j111;
                                oDPairsAndRespectiveSlotsBetweenStopsA2 = oDPairsAndRespectiveSlotsBetweenStops;
                            } catch (Throwable th3) {
                                th = th3;
                                mutex2 = mutex3;
                                mutex2.e(null);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                    linkedHashMap2.put(new Long(j10), pBODPairWithSlotSectionListUiModelA);
                    if (i3 != 0) {
                        if (pBODPairWithSlotSectionListUiModel2 != null) {
                            collection2 = EmptyList.f17557a;
                        } else {
                            collection2 = EmptyList.f17557a;
                        }
                        oDPairsAndRespectiveSlotsBetweenStopsA2 = ODPairsAndRespectiveSlotsBetweenStops.a(oDPairsAndRespectiveSlotsBetweenStopsA2, CollectionsKt.c0(oDPairsAndRespectiveSlotsBetweenStopsA2.f7216a, collection2));
                    }
                    mutex2.e(null);
                    return new ChaloUseCaseResult.Success(oDPairsAndRespectiveSlotsBetweenStopsA2);
                } catch (Throwable th5) {
                    th = th5;
                    mutex2 = mutex3;
                    mutex2.e(null);
                    throw th;
                }
            }
            j6 = slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$3;
            int i8 = slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.I$1;
            int i9 = slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.I$0;
            j8 = slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$2;
            j5 = slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$1;
            j7 = slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$0;
            mutex = (Mutex) slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.L$1;
            List list3 = (List) slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.L$0;
            ResultKt.b(objA);
            list2 = list3;
            i4 = i8;
            i3 = i9;
            PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel3 = (PBODPairWithSlotSectionListUiModel) linkedHashMap3.get(new Long(j7));
            mutex.e(null);
            if (pBODPairWithSlotSectionListUiModel3 != null && i3 == 0) {
                ODPairsAndRespectiveSlotsBetweenStops oDPairsAndRespectiveSlotsBetweenStops6 = pBODPairWithSlotSectionListUiModel3.c;
                if (oDPairsAndRespectiveSlotsBetweenStops6 == null) {
                    oDPairsAndRespectiveSlotsBetweenStops6 = new ODPairsAndRespectiveSlotsBetweenStops(0, 0, 0, 62, (List) EmptyList.f17557a, false);
                }
                return new ChaloUseCaseResult.Success(oDPairsAndRespectiveSlotsBetweenStops6);
            }
            slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.L$0 = null;
            slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.L$1 = null;
            slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$0 = j7;
            slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$1 = j5;
            slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$2 = j8;
            slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.I$0 = i3;
            slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$3 = j6;
            slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.label = 2;
            objA = this.f7259a.a(j6, list2, j5, j8, i3, i4, slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1);
            if (objA != coroutineSingletons) {
                j9 = j7;
                chaloUseCaseResult = (ChaloUseCaseResult) objA;
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                        return new ChaloUseCaseResult.Failure(((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                ODPairsAndRespectiveSlotsBetweenStops oDPairsAndRespectiveSlotsBetweenStops7 = (ODPairsAndRespectiveSlotsBetweenStops) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                oDPairsAndRespectiveSlotsBetweenStopsA = ODPairsAndRespectiveSlotsBetweenStops.a(oDPairsAndRespectiveSlotsBetweenStops7, CollectionsKt.v0(new SlotSelectionSectionInfoManager$sortOdPairsWithSlots$$inlined$sortedByDescending$1(), oDPairsAndRespectiveSlotsBetweenStops7.f7216a));
                slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.L$0 = oDPairsAndRespectiveSlotsBetweenStopsA;
                slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.L$1 = mutex3;
                slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$0 = j9;
                slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$1 = j5;
                slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$2 = j8;
                slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.I$0 = i3;
                slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$3 = j6;
                slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.label = 3;
                if (mutex3.a(slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1) != coroutineSingletons) {
                    long j112 = j5;
                    j10 = j9;
                    j11 = j8;
                    j12 = j112;
                    oDPairsAndRespectiveSlotsBetweenStopsA2 = oDPairsAndRespectiveSlotsBetweenStopsA;
                    linkedHashMap = linkedHashMap3;
                    pBODPairWithSlotSectionListUiModel = (PBODPairWithSlotSectionListUiModel) linkedHashMap.get(new Long(j10));
                    if (pBODPairWithSlotSectionListUiModel != null) {
                        if (i3 == 0) {
                            oDPairsAndRespectiveSlotsBetweenStopsA3 = oDPairsAndRespectiveSlotsBetweenStopsA2;
                        } else {
                            oDPairsAndRespectiveSlotsBetweenStops2 = pBODPairWithSlotSectionListUiModel.c;
                            if (oDPairsAndRespectiveSlotsBetweenStops2 != null) {
                                collection = EmptyList.f17557a;
                            } else {
                                collection = EmptyList.f17557a;
                            }
                            oDPairsAndRespectiveSlotsBetweenStopsA3 = ODPairsAndRespectiveSlotsBetweenStops.a(oDPairsAndRespectiveSlotsBetweenStopsA2, CollectionsKt.c0(oDPairsAndRespectiveSlotsBetweenStopsA2.f7216a, collection));
                        }
                        pBODPairWithSlotSectionListUiModelA = PBODPairWithSlotSectionListUiModel.a(pBODPairWithSlotSectionListUiModel, oDPairsAndRespectiveSlotsBetweenStopsA3, new Long(j6), false, 0, 0, false, false, 16347);
                        pBODPairWithSlotSectionListUiModel2 = pBODPairWithSlotSectionListUiModel;
                        mutex2 = mutex3;
                        linkedHashMap2 = linkedHashMap;
                    } else {
                        linkedHashMap2 = linkedHashMap;
                        strA = FormatTimeInMillisToGivenFormatUseCase.a(this.d, j10, ChaloCustomDateFormat.DAY_NAME_WITH_DATE_FORMAT, 12);
                        slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.L$0 = oDPairsAndRespectiveSlotsBetweenStopsA2;
                        slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.L$1 = mutex3;
                        slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.L$2 = pBODPairWithSlotSectionListUiModel;
                        slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.L$3 = strA;
                        slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$0 = j10;
                        slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$1 = j12;
                        slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$2 = j11;
                        slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.I$0 = i3;
                        slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.J$3 = j6;
                        slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1.label = 4;
                        objA = this.b.a(j10 - CalendarModelKt.MillisecondsIn24Hours, slotSelectionSectionInfoManager$getODPairsForSectionPaginated$1);
                        if (objA == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        str = strA;
                        oDPairsAndRespectiveSlotsBetweenStops = oDPairsAndRespectiveSlotsBetweenStopsA2;
                        j13 = j11;
                        j14 = j12;
                        pBODPairWithSlotSectionListUiModel2 = pBODPairWithSlotSectionListUiModel;
                        mutex2 = mutex3;
                        long j113 = j10;
                        pBODPairWithSlotSectionListUiModelA = new PBODPairWithSlotSectionListUiModel(j113, str, oDPairsAndRespectiveSlotsBetweenStops, j14, j13, new Long(j6), !((Boolean) objA).booleanValue(), 16128);
                        j10 = j113;
                        oDPairsAndRespectiveSlotsBetweenStopsA2 = oDPairsAndRespectiveSlotsBetweenStops;
                    }
                    linkedHashMap2.put(new Long(j10), pBODPairWithSlotSectionListUiModelA);
                    if (i3 != 0) {
                        if (pBODPairWithSlotSectionListUiModel2 != null) {
                            collection2 = EmptyList.f17557a;
                        } else {
                            collection2 = EmptyList.f17557a;
                        }
                        oDPairsAndRespectiveSlotsBetweenStopsA2 = ODPairsAndRespectiveSlotsBetweenStops.a(oDPairsAndRespectiveSlotsBetweenStopsA2, CollectionsKt.c0(oDPairsAndRespectiveSlotsBetweenStopsA2.f7216a, collection2));
                    }
                    mutex2.e(null);
                    return new ChaloUseCaseResult.Success(oDPairsAndRespectiveSlotsBetweenStopsA2);
                }
            }
            return coroutineSingletons;
        } catch (Throwable th6) {
            mutex.e(null);
            throw th6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(long j, ContinuationImpl continuationImpl) {
        SlotSelectionSectionInfoManager$getSectionPaginationInfo$1 slotSelectionSectionInfoManager$getSectionPaginationInfo$1;
        Mutex mutex;
        ODPairsAndRespectiveSlotsBetweenStops oDPairsAndRespectiveSlotsBetweenStops;
        if (continuationImpl instanceof SlotSelectionSectionInfoManager$getSectionPaginationInfo$1) {
            slotSelectionSectionInfoManager$getSectionPaginationInfo$1 = (SlotSelectionSectionInfoManager$getSectionPaginationInfo$1) continuationImpl;
            int i = slotSelectionSectionInfoManager$getSectionPaginationInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                slotSelectionSectionInfoManager$getSectionPaginationInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                slotSelectionSectionInfoManager$getSectionPaginationInfo$1 = new SlotSelectionSectionInfoManager$getSectionPaginationInfo$1(this, continuationImpl);
            }
        } else {
            slotSelectionSectionInfoManager$getSectionPaginationInfo$1 = new SlotSelectionSectionInfoManager$getSectionPaginationInfo$1(this, continuationImpl);
        }
        Object obj = slotSelectionSectionInfoManager$getSectionPaginationInfo$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = slotSelectionSectionInfoManager$getSectionPaginationInfo$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            MutexImpl mutexImpl = this.f;
            slotSelectionSectionInfoManager$getSectionPaginationInfo$1.L$0 = mutexImpl;
            slotSelectionSectionInfoManager$getSectionPaginationInfo$1.J$0 = j;
            slotSelectionSectionInfoManager$getSectionPaginationInfo$1.label = 1;
            if (mutexImpl.a(slotSelectionSectionInfoManager$getSectionPaginationInfo$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            mutex = mutexImpl;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = slotSelectionSectionInfoManager$getSectionPaginationInfo$1.J$0;
            mutex = (Mutex) slotSelectionSectionInfoManager$getSectionPaginationInfo$1.L$0;
            ResultKt.b(obj);
        }
        try {
            PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel = (PBODPairWithSlotSectionListUiModel) this.e.get(new Long(j));
            mutex.e(null);
            if (pBODPairWithSlotSectionListUiModel == null || (oDPairsAndRespectiveSlotsBetweenStops = pBODPairWithSlotSectionListUiModel.c) == null) {
                return null;
            }
            return new PaginationInfo(oDPairsAndRespectiveSlotsBetweenStops.c, oDPairsAndRespectiveSlotsBetweenStops.d, oDPairsAndRespectiveSlotsBetweenStops.e, oDPairsAndRespectiveSlotsBetweenStops.f);
        } catch (Throwable th) {
            mutex.e(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    /* JADX WARN: Code duplicated, block: B:39:0x0096 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0097  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(long j, ContinuationImpl continuationImpl) throws Exception {
        SlotSelectionSectionInfoManager$getSectionTitleBasedOnTimestamp$1 slotSelectionSectionInfoManager$getSectionTitleBasedOnTimestamp$1;
        Object objB;
        if (continuationImpl instanceof SlotSelectionSectionInfoManager$getSectionTitleBasedOnTimestamp$1) {
            slotSelectionSectionInfoManager$getSectionTitleBasedOnTimestamp$1 = (SlotSelectionSectionInfoManager$getSectionTitleBasedOnTimestamp$1) continuationImpl;
            int i = slotSelectionSectionInfoManager$getSectionTitleBasedOnTimestamp$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                slotSelectionSectionInfoManager$getSectionTitleBasedOnTimestamp$1.label = i - Integer.MIN_VALUE;
            } else {
                slotSelectionSectionInfoManager$getSectionTitleBasedOnTimestamp$1 = new SlotSelectionSectionInfoManager$getSectionTitleBasedOnTimestamp$1(this, continuationImpl);
            }
        } else {
            slotSelectionSectionInfoManager$getSectionTitleBasedOnTimestamp$1 = new SlotSelectionSectionInfoManager$getSectionTitleBasedOnTimestamp$1(this, continuationImpl);
        }
        Object objA = slotSelectionSectionInfoManager$getSectionTitleBasedOnTimestamp$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = slotSelectionSectionInfoManager$getSectionTitleBasedOnTimestamp$1.label;
        CheckIsTimestampForTodayUseCase checkIsTimestampForTodayUseCase = this.b;
        StringProvider stringProvider = this.c;
        if (i2 == 0) {
            ResultKt.b(objA);
            slotSelectionSectionInfoManager$getSectionTitleBasedOnTimestamp$1.J$0 = j;
            slotSelectionSectionInfoManager$getSectionTitleBasedOnTimestamp$1.label = 1;
            objA = checkIsTimestampForTodayUseCase.a(j, slotSelectionSectionInfoManager$getSectionTitleBasedOnTimestamp$1);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            j = slotSelectionSectionInfoManager$getSectionTitleBasedOnTimestamp$1.J$0;
            ResultKt.b(objA);
        } else {
            if (i2 == 2) {
                ResultKt.b(objA);
                return objA;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objA);
                return objA;
            }
            j = slotSelectionSectionInfoManager$getSectionTitleBasedOnTimestamp$1.J$0;
            ResultKt.b(objA);
        }
        if (((Boolean) objA).booleanValue()) {
            return FormatTimeInMillisToGivenFormatUseCase.a(this.d, j, ChaloCustomDateFormat.DAY_NAME_WITH_DATE_FORMAT, 12);
        }
        slotSelectionSectionInfoManager$getSectionTitleBasedOnTimestamp$1.label = 4;
        objB = stringProvider.b(StringEnum.TOMORROW, new Object[0], slotSelectionSectionInfoManager$getSectionTitleBasedOnTimestamp$1);
        if (objB != coroutineSingletons) {
            return coroutineSingletons;
        }
        return objB;
        if (((Boolean) objA).booleanValue()) {
            slotSelectionSectionInfoManager$getSectionTitleBasedOnTimestamp$1.label = 2;
            Object objB2 = stringProvider.b(StringEnum.TODAY, new Object[0], slotSelectionSectionInfoManager$getSectionTitleBasedOnTimestamp$1);
            if (objB2 != coroutineSingletons) {
                return objB2;
            }
        } else {
            slotSelectionSectionInfoManager$getSectionTitleBasedOnTimestamp$1.J$0 = j;
            slotSelectionSectionInfoManager$getSectionTitleBasedOnTimestamp$1.label = 3;
            objA = checkIsTimestampForTodayUseCase.a(j - CalendarModelKt.MillisecondsIn24Hours, slotSelectionSectionInfoManager$getSectionTitleBasedOnTimestamp$1);
            if (objA != coroutineSingletons) {
                if (((Boolean) objA).booleanValue()) {
                    return FormatTimeInMillisToGivenFormatUseCase.a(this.d, j, ChaloCustomDateFormat.DAY_NAME_WITH_DATE_FORMAT, 12);
                }
                slotSelectionSectionInfoManager$getSectionTitleBasedOnTimestamp$1.label = 4;
                objB = stringProvider.b(StringEnum.TOMORROW, new Object[0], slotSelectionSectionInfoManager$getSectionTitleBasedOnTimestamp$1);
                if (objB != coroutineSingletons) {
                    return objB;
                }
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object e(long j, List list, int i, int i2, ContinuationImpl continuationImpl) throws Throwable {
        SlotSelectionSectionInfoManager$loadMoreSlotsForSection$1 slotSelectionSectionInfoManager$loadMoreSlotsForSection$1;
        Mutex mutex;
        long j2;
        int i3;
        List list2;
        int i4;
        if (continuationImpl instanceof SlotSelectionSectionInfoManager$loadMoreSlotsForSection$1) {
            slotSelectionSectionInfoManager$loadMoreSlotsForSection$1 = (SlotSelectionSectionInfoManager$loadMoreSlotsForSection$1) continuationImpl;
            int i5 = slotSelectionSectionInfoManager$loadMoreSlotsForSection$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                slotSelectionSectionInfoManager$loadMoreSlotsForSection$1.label = i5 - Integer.MIN_VALUE;
            } else {
                slotSelectionSectionInfoManager$loadMoreSlotsForSection$1 = new SlotSelectionSectionInfoManager$loadMoreSlotsForSection$1(this, continuationImpl);
            }
        } else {
            slotSelectionSectionInfoManager$loadMoreSlotsForSection$1 = new SlotSelectionSectionInfoManager$loadMoreSlotsForSection$1(this, continuationImpl);
        }
        SlotSelectionSectionInfoManager$loadMoreSlotsForSection$1 slotSelectionSectionInfoManager$loadMoreSlotsForSection$2 = slotSelectionSectionInfoManager$loadMoreSlotsForSection$1;
        Object obj = slotSelectionSectionInfoManager$loadMoreSlotsForSection$2.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = slotSelectionSectionInfoManager$loadMoreSlotsForSection$2.label;
        try {
            if (i6 == 0) {
                ResultKt.b(obj);
                slotSelectionSectionInfoManager$loadMoreSlotsForSection$2.L$0 = list;
                mutex = this.f;
                slotSelectionSectionInfoManager$loadMoreSlotsForSection$2.L$1 = mutex;
                j2 = j;
                slotSelectionSectionInfoManager$loadMoreSlotsForSection$2.J$0 = j2;
                i3 = i;
                slotSelectionSectionInfoManager$loadMoreSlotsForSection$2.I$0 = i3;
                slotSelectionSectionInfoManager$loadMoreSlotsForSection$2.I$1 = i2;
                slotSelectionSectionInfoManager$loadMoreSlotsForSection$2.label = 1;
                if (mutex.a(slotSelectionSectionInfoManager$loadMoreSlotsForSection$2) != obj2) {
                    list2 = list;
                    i4 = i2;
                }
            }
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return obj;
            }
            int i7 = slotSelectionSectionInfoManager$loadMoreSlotsForSection$2.I$1;
            int i8 = slotSelectionSectionInfoManager$loadMoreSlotsForSection$2.I$0;
            long j3 = slotSelectionSectionInfoManager$loadMoreSlotsForSection$2.J$0;
            mutex = (Mutex) slotSelectionSectionInfoManager$loadMoreSlotsForSection$2.L$1;
            list2 = (List) slotSelectionSectionInfoManager$loadMoreSlotsForSection$2.L$0;
            ResultKt.b(obj);
            i4 = i7;
            i3 = i8;
            j2 = j3;
            PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel = (PBODPairWithSlotSectionListUiModel) this.e.get(new Long(j2));
            mutex.e(null);
            ODPairAndSlotsFetchFailedReasons.UnknownException unknownException = ODPairAndSlotsFetchFailedReasons.UnknownException.f7213a;
            if (pBODPairWithSlotSectionListUiModel == null) {
                return new ChaloUseCaseResult.Failure(unknownException);
            }
            Long l = pBODPairWithSlotSectionListUiModel.f;
            if (l == null) {
                return new ChaloUseCaseResult.Failure(unknownException);
            }
            long jLongValue = l.longValue();
            long j4 = pBODPairWithSlotSectionListUiModel.d;
            slotSelectionSectionInfoManager$loadMoreSlotsForSection$2.L$0 = null;
            slotSelectionSectionInfoManager$loadMoreSlotsForSection$2.L$1 = null;
            slotSelectionSectionInfoManager$loadMoreSlotsForSection$2.label = 2;
            Object objB = b(jLongValue - j4, j2, list2, j4, pBODPairWithSlotSectionListUiModel.e, i3 + 1, i4, slotSelectionSectionInfoManager$loadMoreSlotsForSection$2);
            return objB == obj2 ? obj2 : objB;
        } catch (Throwable th) {
            mutex.e(null);
            throw th;
        }
    }
}
