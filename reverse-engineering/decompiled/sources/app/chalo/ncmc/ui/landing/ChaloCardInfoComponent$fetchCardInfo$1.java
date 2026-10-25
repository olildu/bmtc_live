package app.chalo.ncmc.ui.landing;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.constants.Source;
import app.chalo.ncmc.data.appmodel.ChaloCardInfo;
import app.chalo.ncmc.data.appmodel.ChaloCardsAppModel;
import app.chalo.ncmc.domain.FetchChaloCardInfoToShowFailureReason;
import app.chalo.ncmc.domain.FetchChaloCardInfoToShowUseCase;
import app.chalo.ncmc.domain.GetMaskedCardNoFromCardNoUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.pi;
import defpackage.u4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ncmc.ui.landing.ChaloCardInfoComponent$fetchCardInfo$1", f = "ChaloCardInfoComponent.kt", l = {616}, m = "invokeSuspend", v = 1)
final class ChaloCardInfoComponent$fetchCardInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $fetchWithNcmcCard;
    int label;
    final /* synthetic */ ChaloCardInfoComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6344a;

        static {
            int[] iArr = new int[FetchChaloCardInfoToShowFailureReason.values().length];
            try {
                iArr[FetchChaloCardInfoToShowFailureReason.API_CALL_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FetchChaloCardInfoToShowFailureReason.NO_CARD_LINKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FetchChaloCardInfoToShowFailureReason.FETCH_NCMC_CARD_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FetchChaloCardInfoToShowFailureReason.FETCH_NCMC_CARD_TIMEOUT_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f6344a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloCardInfoComponent$fetchCardInfo$1(boolean z, ChaloCardInfoComponent chaloCardInfoComponent, Continuation continuation) {
        super(2, continuation);
        this.$fetchWithNcmcCard = z;
        this.this$0 = chaloCardInfoComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloCardInfoComponent$fetchCardInfo$1(this.$fetchWithNcmcCard, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloCardInfoComponent$fetchCardInfo$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = false;
        if (i == 0) {
            ResultKt.b(obj);
            if (this.$fetchWithNcmcCard) {
                this.this$0.J = false;
            }
            this.this$0.E0(new pi(8));
            FetchChaloCardInfoToShowUseCase fetchChaloCardInfoToShowUseCase = this.this$0.o;
            boolean z2 = this.$fetchWithNcmcCard;
            this.label = 1;
            obj = fetchChaloCardInfoToShowUseCase.a(z2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) obj;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            FetchChaloCardInfoToShowFailureReason fetchChaloCardInfoToShowFailureReason = (FetchChaloCardInfoToShowFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
            int i2 = WhenMappings.f6344a[fetchChaloCardInfoToShowFailureReason.ordinal()];
            if (i2 == 1) {
                ChaloCardInfoComponent chaloCardInfoComponent = this.this$0;
                AnalyticsContractImplKt.b(chaloCardInfoComponent.q, "chalo card info fetch failed", Source.CHALO_CARD_INFO_SCREEN, ChaloCardInfoContractKt.a((ChaloCardInfoViewState) chaloCardInfoComponent.f.getValue(), MapsKt.h(new Pair("chaloCardInfoFetchFailedReason", fetchChaloCardInfoToShowFailureReason.name()))), false, 24);
                if (((ChaloCardInfoViewState) this.this$0.f.getValue()).f6359a == null) {
                    this.this$0.E0(new pi(9));
                } else {
                    this.this$0.E0(new pi(10));
                }
            } else if (i2 == 2) {
                ChaloCardInfoComponent chaloCardInfoComponent2 = this.this$0;
                AnalyticsContractImplKt.b(chaloCardInfoComponent2.q, "no linked chalo card found", Source.CHALO_CARD_INFO_SCREEN, ChaloCardInfoContractKt.a((ChaloCardInfoViewState) chaloCardInfoComponent2.f.getValue(), null), false, 24);
                this.this$0.E0(new pi(11));
            } else {
                if (i2 != 3 && i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                ChaloCardInfoComponent chaloCardInfoComponent3 = this.this$0;
                chaloCardInfoComponent3.J = true;
                chaloCardInfoComponent3.J0(false);
            }
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            ChaloCardInfoComponent chaloCardInfoComponent4 = this.this$0;
            ChaloCardsAppModel chaloCardsAppModel = (ChaloCardsAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
            if (!this.$fetchWithNcmcCard && chaloCardInfoComponent4.J) {
                z = true;
            }
            chaloCardInfoComponent4.H = chaloCardsAppModel;
            List list = chaloCardsAppModel.b;
            chaloCardInfoComponent4.G = list;
            boolean z3 = !list.isEmpty();
            List<ChaloCardInfo> list2 = chaloCardsAppModel.f6136a;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
            for (ChaloCardInfo chaloCardInfo : list2) {
                GetMaskedCardNoFromCardNoUseCase getMaskedCardNoFromCardNoUseCase = chaloCardInfoComponent4.n;
                String f6157a = chaloCardInfo.a().getF6157a();
                getMaskedCardNoFromCardNoUseCase.getClass();
                arrayList.add(GetMaskedCardNoFromCardNoUseCase.a(f6157a));
            }
            chaloCardInfoComponent4.E0(new u4(arrayList, z, z3, 1));
        }
        return Unit.f17538a;
    }
}
