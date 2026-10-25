package app.chalo.ncmc.ui.pendingrecharge;

import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.ncmc.data.appmodel.ChaloCardUnsyncedRechargeDetails;
import app.chalo.ncmc.domain.GenerateUvikIntentHashUseCase;
import app.chalo.ncmc.domain.GetMaskedCardNoFromCardNoUseCase;
import app.chalo.ncmc.domain.ProcessUvikResultUseCase;
import app.chalo.ncmc.ui.CardPendingRechargesArgsModel;
import app.chalo.ncmc.ui.pendingrecharge.compose.UnsyncRechargeListForCardUiModel;
import app.chalo.ncmc.uvik.UvikSdkHelper;
import app.chalo.ncmc.uvik.UvikServiceType;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.args.CardPendingRechargesScreenArgs;
import com.arkivanov.decompose.ComponentContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/ncmc/ui/pendingrecharge/PendingRechargeComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/ncmc/ui/pendingrecharge/PendingRechargeViewIntent;", "Lapp/chalo/ncmc/ui/pendingrecharge/PendingRechargeDataState;", "Lapp/chalo/ncmc/ui/pendingrecharge/PendingRechargeViewState;", "Lapp/chalo/ncmc/ui/pendingrecharge/PendingRechargeSideEffect;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PendingRechargeComponent extends ChaloBaseStateMviComponent<PendingRechargeViewIntent, PendingRechargeDataState, PendingRechargeViewState, PendingRechargeSideEffect> {
    public final StringProvider k;
    public final GetMaskedCardNoFromCardNoUseCase l;
    public final CurrencyFeature m;
    public final UvikSdkHelper n;
    public final GenerateUvikIntentHashUseCase o;
    public final ProcessUvikResultUseCase p;
    public final KotlinToastManager q;
    public Job r;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/pendingrecharge/PendingRechargeComponent$Companion;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static CardPendingRechargesScreenArgs a(List recharges) {
            Intrinsics.i(recharges, "recharges");
            CardPendingRechargesArgsModel cardPendingRechargesArgsModel = new CardPendingRechargesArgsModel(recharges);
            Json json = ChaloJson.b;
            json.getClass();
            return new CardPendingRechargesScreenArgs(json.a(CardPendingRechargesArgsModel.INSTANCE.serializer(), cardPendingRechargesArgsModel));
        }
    }

    public PendingRechargeComponent(ComponentContext componentContext, CardPendingRechargesScreenArgs cardPendingRechargesScreenArgs, StringProvider stringProvider, GetMaskedCardNoFromCardNoUseCase getMaskedCardNoFromCardNoUseCase, CurrencyFeature currencyFeature, UvikSdkHelper uvikSdkHelper, GenerateUvikIntentHashUseCase generateUvikIntentHashUseCase, ProcessUvikResultUseCase processUvikResultUseCase, KotlinToastManager kotlinToastManager) {
        super(componentContext);
        this.k = stringProvider;
        this.l = getMaskedCardNoFromCardNoUseCase;
        this.m = currencyFeature;
        this.n = uvikSdkHelper;
        this.o = generateUvikIntentHashUseCase;
        this.p = processUvikResultUseCase;
        this.q = kotlinToastManager;
        Json json = ChaloJson.b;
        String str = cardPendingRechargesScreenArgs.b;
        json.getClass();
        F0(new PendingRechargeViewIntent.Initialize(((CardPendingRechargesArgsModel) json.b(str, CardPendingRechargesArgsModel.INSTANCE.serializer())).f6259a));
    }

    public final void F0(PendingRechargeViewIntent intent) {
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof PendingRechargeViewIntent.Initialize;
        ContextScope contextScope = this.j;
        if (z) {
            BuildersKt.d(contextScope, null, null, new PendingRechargeComponent$handleInitialIntent$1(this, ((PendingRechargeViewIntent.Initialize) intent).f6421a, null), 3);
            return;
        }
        if (intent instanceof PendingRechargeViewIntent.UpdateNcmcCardClicked) {
            BuildersKt.d(contextScope, null, null, new PendingRechargeComponent$startUvikTapFlowForBalanceUpdate$1(this, UvikServiceType.BALANCE_UPDATE, null), 3);
        } else {
            if (!(intent instanceof PendingRechargeViewIntent.UvikTapResultIntent)) {
                throw new NoWhenBranchMatchedException();
            }
            BuildersKt.d(contextScope, null, null, new PendingRechargeComponent$handleUvikTapResult$1(this, null, null), 3);
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        PendingRechargeDataState pendingRechargeDataState = (PendingRechargeDataState) obj;
        boolean z = pendingRechargeDataState.f6420a;
        List<ChaloCardUnsyncedRechargeDetails> list = pendingRechargeDataState.b;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
        for (ChaloCardUnsyncedRechargeDetails chaloCardUnsyncedRechargeDetails : list) {
            String str = chaloCardUnsyncedRechargeDetails.f6134a;
            this.l.getClass();
            arrayList.add(new UnsyncRechargeListForCardUiModel(GetMaskedCardNoFromCardNoUseCase.a(str), this.m.a(chaloCardUnsyncedRechargeDetails.b, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING)));
        }
        return new PendingRechargeViewState(z, arrayList, pendingRechargeDataState.c);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new PendingRechargeDataState(EmptyList.f17557a, false, false);
    }
}
