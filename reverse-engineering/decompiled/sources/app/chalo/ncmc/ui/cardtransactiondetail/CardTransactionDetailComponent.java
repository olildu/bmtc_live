package app.chalo.ncmc.ui.cardtransactiondetail;

import app.chalo.contract.BasicInfoContract;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.ncmc.data.cardtransactions.CardMerchantTransactionAppModel;
import app.chalo.ncmc.data.cardtransactions.CardPassPurchaseTransactionAppModel;
import app.chalo.ncmc.data.cardtransactions.CardRechargeTransactionAppModel;
import app.chalo.ncmc.data.cardtransactions.CardTransaction;
import app.chalo.ncmc.ui.CardTransactionDetailArgsModel;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionTypeUiModel;
import app.chalo.network.config.ChaloJson;
import app.chalo.scenes.args.CardTransactionDetailArgs;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import defpackage.mf;
import defpackage.u;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/ui/cardtransactiondetail/CardTransactionDetailComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/ncmc/ui/cardtransactiondetail/CardTransactionDetailViewIntent;", "Lapp/chalo/ncmc/ui/cardtransactiondetail/CardTransactionDetailViewState;", "Lapp/chalo/ncmc/ui/cardtransactiondetail/CardTransactionDetailDataState;", "Lapp/chalo/ncmc/ui/cardtransactiondetail/CardTransactionDetailSideEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CardTransactionDetailComponent extends ChaloBaseStateMviComponent<CardTransactionDetailViewIntent, CardTransactionDetailViewState, CardTransactionDetailViewState, CardTransactionDetailSideEffect> {
    public final TimeUtilsContract k;
    public final BasicInfoContract l;
    public final CurrencyFeature m;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6312a;

        static {
            int[] iArr = new int[CardTransactionTypeUiModel.values().length];
            try {
                iArr[CardTransactionTypeUiModel.PASS_PURCHASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardTransactionTypeUiModel.RECHARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardTransactionTypeUiModel.MERCHANT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6312a = iArr;
        }
    }

    public CardTransactionDetailComponent(ComponentContext componentContext, CardTransactionDetailArgs cardTransactionDetailArgs, TimeUtilsContract timeUtilsContract, BasicInfoContract basicInfoContract, CurrencyFeature currencyFeature) {
        super(componentContext);
        this.k = timeUtilsContract;
        this.l = basicInfoContract;
        this.m = currencyFeature;
        Json json = ChaloJson.b;
        String str = cardTransactionDetailArgs.b;
        json.getClass();
        CardTransactionDetailArgsModel cardTransactionDetailArgsModel = (CardTransactionDetailArgsModel) json.b(str, CardTransactionDetailArgsModel.INSTANCE.serializer());
        CardTransaction cardTransaction = cardTransactionDetailArgsModel.f6263a;
        CardTransactionTypeUiModel cardTransactionTypeUiModel = cardTransactionDetailArgsModel.b;
        CardTransactionDetailViewIntent.InitializationIntent initializationIntent = new CardTransactionDetailViewIntent.InitializationIntent(cardTransaction, cardTransactionTypeUiModel);
        C0(initializationIntent);
        if (this.d) {
            return;
        }
        this.d = true;
        int i = WhenMappings.f6312a[cardTransactionTypeUiModel.ordinal()];
        if (i == 1) {
            CardPassPurchaseTransactionAppModel cardPassPurchaseTransactionAppModel = (CardPassPurchaseTransactionAppModel) cardTransaction;
            Long l = cardPassPurchaseTransactionAppModel.f;
            E0(new mf(initializationIntent, cardPassPurchaseTransactionAppModel, this, l != null ? timeUtilsContract.j(l.longValue()) : null, (l != null ? Intrinsics.l(l.longValue(), basicInfoContract.e()) : -1) <= 0));
        } else if (i == 2) {
            E0(new u(8, initializationIntent, (CardRechargeTransactionAppModel) cardTransaction, this));
        } else {
            if (i != 3) {
                return;
            }
            E0(new u(9, initializationIntent, (CardMerchantTransactionAppModel) cardTransaction, this));
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (CardTransactionDetailViewState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new CardTransactionDetailViewState(null, null, null, null, null, null, null, 0, null, null, false, null);
    }
}
