package app.chalo.premiumbus.ui.passpurchaselanding;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.productbooking.common.data.models.app.ProductConfigCompleteDetailsListAppModel;
import app.chalo.productbooking.common.data.models.app.ProductImageAppModel;
import app.chalo.productbooking.common.data.models.app.ProductImageType;
import app.chalo.productbooking.common.domain.CompleteProductConfigFetchFailedReason;
import app.chalo.productbooking.common.domain.FetchCompleteProductConfigByIdUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.hj0;
import defpackage.vo1;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
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
@DebugMetadata(c = "app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenComponent$handleWithConfigIdFlow$1", f = "PbPassPurchaseLandingScreenComponent.kt", l = {956}, m = "invokeSuspend", v = 1)
final class PbPassPurchaseLandingScreenComponent$handleWithConfigIdFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $configId;
    int label;
    final /* synthetic */ PbPassPurchaseLandingScreenComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PbPassPurchaseLandingScreenComponent$handleWithConfigIdFlow$1(PbPassPurchaseLandingScreenComponent pbPassPurchaseLandingScreenComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pbPassPurchaseLandingScreenComponent;
        this.$configId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PbPassPurchaseLandingScreenComponent$handleWithConfigIdFlow$1(this.this$0, this.$configId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PbPassPurchaseLandingScreenComponent$handleWithConfigIdFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0099  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PbPassPurchaseLandingScreenComponent$handleWithConfigIdFlow$1 pbPassPurchaseLandingScreenComponent$handleWithConfigIdFlow$1;
        String str;
        Object next;
        Object next2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            FetchCompleteProductConfigByIdUseCase fetchCompleteProductConfigByIdUseCase = this.this$0.m;
            String str2 = this.$configId;
            this.label = 1;
            pbPassPurchaseLandingScreenComponent$handleWithConfigIdFlow$1 = this;
            obj = FetchCompleteProductConfigByIdUseCase.b(fetchCompleteProductConfigByIdUseCase, str2, null, null, pbPassPurchaseLandingScreenComponent$handleWithConfigIdFlow$1, 14);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            pbPassPurchaseLandingScreenComponent$handleWithConfigIdFlow$1 = this;
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) obj;
        String str3 = null;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            AnalyticsContractImplKt.b(pbPassPurchaseLandingScreenComponent$handleWithConfigIdFlow$1.this$0.s, "pass image url from config fetch failure", Source.PB_PASS_PURCHASE_LANDING_SCREEN, vo1.s("errorCode", String.valueOf(((CompleteProductConfigFetchFailedReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).a())), false, 24);
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            PbPassPurchaseLandingScreenComponent pbPassPurchaseLandingScreenComponent = pbPassPurchaseLandingScreenComponent$handleWithConfigIdFlow$1.this$0;
            String str4 = pbPassPurchaseLandingScreenComponent$handleWithConfigIdFlow$1.$configId;
            Object obj2 = ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
            AnalyticsContract analyticsContract = pbPassPurchaseLandingScreenComponent.s;
            Source source = Source.PB_PASS_PURCHASE_LANDING_SCREEN;
            Pair pair = new Pair("configId", str4);
            ProductConfigCompleteDetailsListAppModel productConfigCompleteDetailsListAppModel = (ProductConfigCompleteDetailsListAppModel) obj2;
            List list = productConfigCompleteDetailsListAppModel.f8205a.I;
            if (list != null) {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                } while (((ProductImageAppModel) next2).b != ProductImageType.PASS_PURCHASE_MARKETING_URL);
                ProductImageAppModel productImageAppModel = (ProductImageAppModel) next2;
                if (productImageAppModel != null) {
                    str = productImageAppModel.f8224a;
                } else {
                    str = null;
                }
            } else {
                str = null;
            }
            AnalyticsContractImplKt.b(analyticsContract, "pass image url from config fetch success", source, MapsKt.i(pair, new Pair("image url", String.valueOf(str))), false, 24);
            List list2 = productConfigCompleteDetailsListAppModel.f8205a.I;
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (((ProductImageAppModel) next).b != ProductImageType.PASS_PURCHASE_MARKETING_URL);
                ProductImageAppModel productImageAppModel2 = (ProductImageAppModel) next;
                if (productImageAppModel2 != null) {
                    str3 = productImageAppModel2.f8224a;
                }
            }
        }
        pbPassPurchaseLandingScreenComponent$handleWithConfigIdFlow$1.this$0.E0(new hj0(str3, 22));
        return Unit.f17538a;
    }
}
