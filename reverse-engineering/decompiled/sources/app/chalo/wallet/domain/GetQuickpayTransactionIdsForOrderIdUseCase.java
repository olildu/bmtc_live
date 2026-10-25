package app.chalo.wallet.domain;

import app.chalo.walletframework.quickpay.data.model.appmodel.QuickPayAppModel;
import app.chalo.walletframework.quickpay.data.repository.QuickPayRepository;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/domain/GetQuickpayTransactionIdsForOrderIdUseCase;", "", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetQuickpayTransactionIdsForOrderIdUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QuickPayRepository f10773a;

    public GetQuickpayTransactionIdsForOrderIdUseCase(QuickPayRepository quickPayRepository) {
        this.f10773a = quickPayRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(String str, ContinuationImpl continuationImpl) {
        GetQuickpayTransactionIdsForOrderIdUseCase$invoke$1 getQuickpayTransactionIdsForOrderIdUseCase$invoke$1;
        if (continuationImpl instanceof GetQuickpayTransactionIdsForOrderIdUseCase$invoke$1) {
            getQuickpayTransactionIdsForOrderIdUseCase$invoke$1 = (GetQuickpayTransactionIdsForOrderIdUseCase$invoke$1) continuationImpl;
            int i = getQuickpayTransactionIdsForOrderIdUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getQuickpayTransactionIdsForOrderIdUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getQuickpayTransactionIdsForOrderIdUseCase$invoke$1 = new GetQuickpayTransactionIdsForOrderIdUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getQuickpayTransactionIdsForOrderIdUseCase$invoke$1 = new GetQuickpayTransactionIdsForOrderIdUseCase$invoke$1(this, continuationImpl);
        }
        Object objJ = getQuickpayTransactionIdsForOrderIdUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getQuickpayTransactionIdsForOrderIdUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objJ);
            getQuickpayTransactionIdsForOrderIdUseCase$invoke$1.label = 1;
            objJ = this.f10773a.j(str, getQuickpayTransactionIdsForOrderIdUseCase$invoke$1);
            if (objJ == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objJ);
        }
        Iterable iterable = (Iterable) objJ;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((QuickPayAppModel) it.next()).b);
        }
        return arrayList;
    }
}
