package app.chalo.ncmc.domain;

import app.chalo.ncmc.data.appmodel.CardsTypeInfoAppModel;
import app.chalo.ncmc.data.appmodel.ChaloCardsAppModel;
import app.chalo.ncmc.data.appmodel.ChaloCardsInfoAppModel;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/domain/FetchChaloCardInfoToShowUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchChaloCardInfoToShowUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FetchLinkedChaloCardInfoUseCase f6227a;

    public FetchChaloCardInfoToShowUseCase(FetchLinkedChaloCardInfoUseCase fetchLinkedChaloCardInfoUseCase) {
        this.f6227a = fetchLinkedChaloCardInfoUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(boolean z, ContinuationImpl continuationImpl) {
        FetchChaloCardInfoToShowUseCase$invoke$1 fetchChaloCardInfoToShowUseCase$invoke$1;
        FetchChaloCardInfoToShowFailureReason fetchChaloCardInfoToShowFailureReason;
        if (continuationImpl instanceof FetchChaloCardInfoToShowUseCase$invoke$1) {
            fetchChaloCardInfoToShowUseCase$invoke$1 = (FetchChaloCardInfoToShowUseCase$invoke$1) continuationImpl;
            int i = fetchChaloCardInfoToShowUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchChaloCardInfoToShowUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchChaloCardInfoToShowUseCase$invoke$1 = new FetchChaloCardInfoToShowUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchChaloCardInfoToShowUseCase$invoke$1 = new FetchChaloCardInfoToShowUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = fetchChaloCardInfoToShowUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchChaloCardInfoToShowUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            fetchChaloCardInfoToShowUseCase$invoke$1.label = 1;
            objA = this.f6227a.a(z, fetchChaloCardInfoToShowUseCase$invoke$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objA;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            int i3 = FetchChaloCardInfoToShowUseCaseKt.WhenMappings.f6228a[((FetchLinkedChaloCardFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).ordinal()];
            if (i3 == 1) {
                fetchChaloCardInfoToShowFailureReason = FetchChaloCardInfoToShowFailureReason.API_CALL_FAILED;
            } else if (i3 == 2) {
                fetchChaloCardInfoToShowFailureReason = FetchChaloCardInfoToShowFailureReason.NO_CARD_LINKED;
            } else if (i3 == 3) {
                fetchChaloCardInfoToShowFailureReason = FetchChaloCardInfoToShowFailureReason.FETCH_NCMC_CARD_ERROR;
            } else {
                if (i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                fetchChaloCardInfoToShowFailureReason = FetchChaloCardInfoToShowFailureReason.FETCH_NCMC_CARD_TIMEOUT_ERROR;
            }
            return new ChaloUseCaseResult.Failure(fetchChaloCardInfoToShowFailureReason);
        }
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        ChaloCardsInfoAppModel chaloCardsInfoAppModel = (ChaloCardsInfoAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
        ArrayList arrayList = chaloCardsInfoAppModel.f6138a;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            CollectionsKt.i(((CardsTypeInfoAppModel) obj).getB(), arrayList2);
        }
        return arrayList2.isEmpty() ? new ChaloUseCaseResult.Failure(FetchChaloCardInfoToShowFailureReason.NO_CARD_LINKED) : new ChaloUseCaseResult.Success(new ChaloCardsAppModel(arrayList2, chaloCardsInfoAppModel.b));
    }
}
