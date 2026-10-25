package app.chalo.ncmc.domain;

import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import app.chalo.ncmc.data.cardtransactions.CardTransaction;
import app.chalo.ncmc.data.cardtransactions.CardTransactionAppModel;
import app.chalo.ncmc.repository.INcmcCardRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/ncmc/domain/CardTransactionPagingSource;", "Landroidx/paging/PagingSource;", "", "Lapp/chalo/ncmc/data/cardtransactions/CardTransaction;", "Lapp/cash/paging/PagingSource;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CardTransactionPagingSource extends PagingSource<Integer, CardTransaction> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final INcmcCardRepository f6212a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    /* JADX INFO: renamed from: app.chalo.ncmc.domain.CardTransactionPagingSource$load$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.ncmc.domain.CardTransactionPagingSource", f = "CardTransactionPagingSource.kt", l = {23}, m = "load", v = 1)
    final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CardTransactionPagingSource.this.load(null, this);
        }
    }

    public CardTransactionPagingSource(INcmcCardRepository iNcmcCardRepository, String cardNumber, String str, String str2, String cardType) {
        Intrinsics.i(cardNumber, "cardNumber");
        Intrinsics.i(cardType, "cardType");
        this.f6212a = iNcmcCardRepository;
        this.b = cardNumber;
        this.c = str;
        this.d = str2;
        this.e = cardType;
    }

    @Override // androidx.paging.PagingSource
    public final Integer getRefreshKey(PagingState<Integer, CardTransaction> state) {
        Intrinsics.i(state, "state");
        return state.getAnchorPosition();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // androidx.paging.PagingSource
    public final Object load(PagingSource.LoadParams<Integer> loadParams, Continuation<? super PagingSource.LoadResult<Integer, CardTransaction>> continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i2 = anonymousClass1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object objB = anonymousClass2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = anonymousClass2.label;
        try {
            if (i3 == 0) {
                ResultKt.b(objB);
                Integer key = loadParams.getKey();
                int iIntValue = key != null ? key.intValue() : 1;
                INcmcCardRepository iNcmcCardRepository = this.f6212a;
                String str = this.b;
                String str2 = this.c;
                String str3 = this.d;
                String str4 = this.e;
                anonymousClass2.I$0 = iIntValue;
                anonymousClass2.label = 1;
                objB = iNcmcCardRepository.b(iIntValue, str, str2, str3, str4, anonymousClass2);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                i = iIntValue;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = anonymousClass2.I$0;
                ResultKt.b(objB);
            }
            CardTransactionAppModel cardTransactionAppModel = (CardTransactionAppModel) objB;
            List listV0 = CollectionsKt.v0(new CardTransactionPagingSource$load$$inlined$sortedByDescending$1(), cardTransactionAppModel.f6183a);
            Integer num = null;
            Integer num2 = i == 1 ? null : new Integer(i - 1);
            if (i < cardTransactionAppModel.b) {
                num = new Integer(i + 1);
            }
            return new PagingSource.LoadResult.Page(listV0, num2, num);
        } catch (Exception e) {
            return new PagingSource.LoadResult.Error(e);
        }
    }
}
