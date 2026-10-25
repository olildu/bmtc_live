package app.chalo.tripreceipt.domain;

import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.chalo.models.UserBookingsStatusType;
import app.chalo.productsummary.domain.CheckAndFetchPassDataFromPassIdUseCase;
import app.chalo.superpass.data.models.entities.SuperPass;
import app.chalo.superpass.data.repository.DigitalTripReceiptRepository;
import app.chalo.superpass.data.repository.SuperPassRepository;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/tripreceipt/domain/FetchSuperPassTripHistoryDataUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchSuperPassTripHistoryDataUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuperPassRepository f9735a;
    public final CheckAndFetchPassDataFromPassIdUseCase b;
    public final DigitalTripReceiptRepository c;

    public FetchSuperPassTripHistoryDataUseCase(SuperPassRepository superPassRepository, CheckAndFetchPassDataFromPassIdUseCase checkAndFetchPassDataFromPassIdUseCase, DigitalTripReceiptRepository digitalTripReceiptRepository) {
        this.f9735a = superPassRepository;
        this.b = checkAndFetchPassDataFromPassIdUseCase;
        this.c = digitalTripReceiptRepository;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String lSuperPassId, ContinuationImpl continuationImpl) {
        FetchSuperPassTripHistoryDataUseCase$invoke$1 fetchSuperPassTripHistoryDataUseCase$invoke$1;
        long j;
        long jLongValue;
        FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1F;
        Object objO;
        String str;
        Flow flow;
        long j2;
        if (continuationImpl instanceof FetchSuperPassTripHistoryDataUseCase$invoke$1) {
            fetchSuperPassTripHistoryDataUseCase$invoke$1 = (FetchSuperPassTripHistoryDataUseCase$invoke$1) continuationImpl;
            int i = fetchSuperPassTripHistoryDataUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchSuperPassTripHistoryDataUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchSuperPassTripHistoryDataUseCase$invoke$1 = new FetchSuperPassTripHistoryDataUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchSuperPassTripHistoryDataUseCase$invoke$1 = new FetchSuperPassTripHistoryDataUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = fetchSuperPassTripHistoryDataUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchSuperPassTripHistoryDataUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            fetchSuperPassTripHistoryDataUseCase$invoke$1.L$0 = lSuperPassId;
            fetchSuperPassTripHistoryDataUseCase$invoke$1.label = 1;
            objA = this.b.a(lSuperPassId, fetchSuperPassTripHistoryDataUseCase$invoke$1);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            lSuperPassId = (String) fetchSuperPassTripHistoryDataUseCase$invoke$1.L$0;
            ResultKt.b(objA);
        } else {
            if (i2 == 2) {
                j = fetchSuperPassTripHistoryDataUseCase$invoke$1.J$0;
                lSuperPassId = (String) fetchSuperPassTripHistoryDataUseCase$invoke$1.L$0;
                ResultKt.b(objA);
                jLongValue = ((Number) objA).longValue();
                Intrinsics.i(lSuperPassId, "lSuperPassId");
                flowQuery$mapToList$$inlined$map$1F = this.c.f9592a.f(lSuperPassId);
                UserBookingsStatusType userBookingsStatusType = UserBookingsStatusType.ALL;
                fetchSuperPassTripHistoryDataUseCase$invoke$1.L$0 = lSuperPassId;
                fetchSuperPassTripHistoryDataUseCase$invoke$1.L$1 = flowQuery$mapToList$$inlined$map$1F;
                fetchSuperPassTripHistoryDataUseCase$invoke$1.J$0 = j;
                fetchSuperPassTripHistoryDataUseCase$invoke$1.J$1 = jLongValue;
                fetchSuperPassTripHistoryDataUseCase$invoke$1.label = 3;
                objO = this.f9735a.o(userBookingsStatusType, fetchSuperPassTripHistoryDataUseCase$invoke$1);
                if (objO != coroutineSingletons) {
                    str = lSuperPassId;
                    flow = flowQuery$mapToList$$inlined$map$1F;
                    objA = objO;
                    j2 = jLongValue;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = fetchSuperPassTripHistoryDataUseCase$invoke$1.J$1;
            long j3 = fetchSuperPassTripHistoryDataUseCase$invoke$1.J$0;
            flow = (Flow) fetchSuperPassTripHistoryDataUseCase$invoke$1.L$1;
            String str2 = (String) fetchSuperPassTripHistoryDataUseCase$invoke$1.L$0;
            ResultKt.b(objA);
            j = j3;
            str = str2;
        }
        return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(flow, (Flow) objA, new FetchSuperPassTripHistoryDataUseCase$invoke$2(j2, str, j, null));
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objA;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(EmptyList.f17557a);
        }
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        SuperPass superPass = (SuperPass) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
        long j4 = superPass.getB().d;
        fetchSuperPassTripHistoryDataUseCase$invoke$1.L$0 = lSuperPassId;
        fetchSuperPassTripHistoryDataUseCase$invoke$1.J$0 = j4;
        fetchSuperPassTripHistoryDataUseCase$invoke$1.label = 2;
        objA = superPass.d(fetchSuperPassTripHistoryDataUseCase$invoke$1);
        if (objA != coroutineSingletons) {
            j = j4;
            jLongValue = ((Number) objA).longValue();
            Intrinsics.i(lSuperPassId, "lSuperPassId");
            flowQuery$mapToList$$inlined$map$1F = this.c.f9592a.f(lSuperPassId);
            UserBookingsStatusType userBookingsStatusType2 = UserBookingsStatusType.ALL;
            fetchSuperPassTripHistoryDataUseCase$invoke$1.L$0 = lSuperPassId;
            fetchSuperPassTripHistoryDataUseCase$invoke$1.L$1 = flowQuery$mapToList$$inlined$map$1F;
            fetchSuperPassTripHistoryDataUseCase$invoke$1.J$0 = j;
            fetchSuperPassTripHistoryDataUseCase$invoke$1.J$1 = jLongValue;
            fetchSuperPassTripHistoryDataUseCase$invoke$1.label = 3;
            objO = this.f9735a.o(userBookingsStatusType2, fetchSuperPassTripHistoryDataUseCase$invoke$1);
            if (objO != coroutineSingletons) {
                str = lSuperPassId;
                flow = flowQuery$mapToList$$inlined$map$1F;
                objA = objO;
                j2 = jLongValue;
                return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(flow, (Flow) objA, new FetchSuperPassTripHistoryDataUseCase$invoke$2(j2, str, j, null));
            }
        }
        return coroutineSingletons;
    }
}
