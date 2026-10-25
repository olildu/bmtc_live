package app.chalo.productpurchase.passselection.ui;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel;
import app.chalo.productpurchase.productselection.data.repository.ProductPurchaseRepository;
import defpackage.aj;
import defpackage.gf;
import defpackage.vo1;
import java.util.LinkedHashMap;
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
@DebugMetadata(c = "app.chalo.productpurchase.passselection.ui.PassSelectionComponent$handleInitializationIntent$1", f = "PassSelectionComponent.kt", l = {131}, m = "invokeSuspend", v = 1)
final class PassSelectionComponent$handleInitializationIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PassSelectionIntent.InitializationIntent $intent;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PassSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassSelectionComponent$handleInitializationIntent$1(PassSelectionComponent passSelectionComponent, PassSelectionIntent.InitializationIntent initializationIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = passSelectionComponent;
        this.$intent = initializationIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PassSelectionComponent$handleInitializationIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PassSelectionComponent$handleInitializationIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        Source source;
        Object objH;
        Source source2;
        String str2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            PassSelectionComponent passSelectionComponent = this.this$0;
            PassSelectionRestoreState passSelectionRestoreState = passSelectionComponent.t;
            if (passSelectionRestoreState == null || (str = passSelectionRestoreState.f8540a) == null) {
                str = this.$intent.c;
            }
            if (passSelectionRestoreState == null || (source = passSelectionRestoreState.b) == null) {
                source = this.$intent.b;
            }
            ProductPurchaseRepository productPurchaseRepository = passSelectionComponent.l;
            this.L$0 = str;
            this.L$1 = source;
            this.label = 1;
            objH = productPurchaseRepository.h(str, this);
            if (objH == coroutineSingletons) {
                return coroutineSingletons;
            }
            source2 = source;
            str2 = str;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Source source3 = (Source) this.L$1;
            String str3 = (String) this.L$0;
            ResultKt.b(obj);
            source2 = source3;
            str2 = str3;
            objH = obj;
        }
        ProductConfigResponseAppModel productConfigResponseAppModel = (ProductConfigResponseAppModel) objH;
        Unit unit = Unit.f17538a;
        if (productConfigResponseAppModel == null || !PassSelectionComponent.G0(this.this$0, productConfigResponseAppModel)) {
            gf.u(null, this.this$0.k);
            return unit;
        }
        AnalyticsContract.DefaultImpls.a(this.this$0.p, "pass selection screen opened", "", vo1.s("configId", str2), null, true, 8);
        PassSelectionComponent passSelectionComponent2 = this.this$0;
        Source source4 = Source.NONE;
        passSelectionComponent2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Boolean bool = Boolean.TRUE;
        linkedHashMap.put("isSuperPass", bool);
        linkedHashMap.put("previousScreen", source2.getSourceName());
        AnalyticsContractImplKt.b(passSelectionComponent2.p, "book pass screen opened", source4, linkedHashMap, true, 8);
        DerivedPassSelectionScreenState derivedPassSelectionScreenStateF0 = PassSelectionComponent.F0(this.this$0, (ProductConfigResponseAppModel.SuperPassConfigAppModel) productConfigResponseAppModel);
        PassSelectionScreenType passSelectionScreenType = derivedPassSelectionScreenStateF0.c;
        if (!(passSelectionScreenType instanceof PassSelectionScreenType.PassSelection)) {
            if (!(passSelectionScreenType instanceof PassSelectionScreenType.SubCategorySelection)) {
                throw new NoWhenBranchMatchedException();
            }
            AnalyticsContract.DefaultImpls.a(this.this$0.p, "subCategory selection screen opened", "", MapsKt.i(new Pair("configId", str2), new Pair("isSuperPass", bool)), null, true, 8);
        }
        PassSelectionComponent passSelectionComponent3 = this.this$0;
        passSelectionComponent3.E0(new aj(passSelectionComponent3, this.$intent, productConfigResponseAppModel, derivedPassSelectionScreenStateF0, str2, source2));
        return unit;
    }
}
