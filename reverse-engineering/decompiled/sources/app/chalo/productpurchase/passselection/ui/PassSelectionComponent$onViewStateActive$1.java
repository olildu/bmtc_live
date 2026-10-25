package app.chalo.productpurchase.passselection.ui;

import app.chalo.productbooking.common.data.models.app.ProductConfigCompleteDetailsListAppModelKt;
import app.chalo.productbooking.common.data.models.app.ProductImageType;
import app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigSubCategoryResponseAppModel;
import app.chalo.productpurchase.productselection.data.repository.ProductPurchaseRepository;
import app.chalo.productpurchase.utils.BookingHelper;
import defpackage.za0;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productpurchase.passselection.ui.PassSelectionComponent$onViewStateActive$1", f = "PassSelectionComponent.kt", l = {170}, m = "invokeSuspend", v = 1)
final class PassSelectionComponent$onViewStateActive$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProductConfigResponseAppModel.SuperPassConfigAppModel $currentProductConfig;
    final /* synthetic */ String $productId;
    int label;
    final /* synthetic */ PassSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassSelectionComponent$onViewStateActive$1(PassSelectionComponent passSelectionComponent, String str, ProductConfigResponseAppModel.SuperPassConfigAppModel superPassConfigAppModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = passSelectionComponent;
        this.$productId = str;
        this.$currentProductConfig = superPassConfigAppModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PassSelectionComponent$onViewStateActive$1(this.this$0, this.$productId, this.$currentProductConfig, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PassSelectionComponent$onViewStateActive$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SuperPassProductConfigSubCategoryResponseAppModel superPassProductConfigSubCategoryResponseAppModelO0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            ProductPurchaseRepository productPurchaseRepository = this.this$0.l;
            String str = this.$productId;
            this.label = 1;
            obj = productPurchaseRepository.h(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        ProductConfigResponseAppModel productConfigResponseAppModel = (ProductConfigResponseAppModel) obj;
        Unit unit = Unit.f17538a;
        if (productConfigResponseAppModel != null && PassSelectionComponent.G0(this.this$0, productConfigResponseAppModel) && !productConfigResponseAppModel.equals(this.$currentProductConfig)) {
            ProductConfigResponseAppModel.SuperPassConfigAppModel superPassConfigAppModel = (ProductConfigResponseAppModel.SuperPassConfigAppModel) productConfigResponseAppModel;
            DerivedPassSelectionScreenState derivedPassSelectionScreenStateF0 = PassSelectionComponent.F0(this.this$0, superPassConfigAppModel);
            PassSelectionScreenType passSelection = derivedPassSelectionScreenStateF0.c;
            PassSelectionComponent passSelectionComponent = this.this$0;
            PassSelectionScreenType passSelectionScreenType = ((PassSelectionDataState) passSelectionComponent.f.getValue()).h;
            PassSelectionScreenType.PassSelection passSelection2 = passSelectionScreenType instanceof PassSelectionScreenType.PassSelection ? (PassSelectionScreenType.PassSelection) passSelectionScreenType : null;
            if (passSelection2 != null) {
                String str2 = passSelection2.f8546a;
                if (str2.length() != 0 && (superPassProductConfigSubCategoryResponseAppModelO0 = PassSelectionComponent.O0(superPassConfigAppModel, str2)) != null) {
                    HashMap map = derivedPassSelectionScreenStateF0.f8524a;
                    passSelectionComponent.m.getClass();
                    Map mapB = BookingHelper.b(str2, map);
                    LinkedHashMap linkedHashMap = derivedPassSelectionScreenStateF0.b;
                    List list = superPassConfigAppModel.K;
                    passSelection = new PassSelectionScreenType.PassSelection(str2, mapB, linkedHashMap, superPassProductConfigSubCategoryResponseAppModelO0, list != null ? ProductConfigCompleteDetailsListAppModelKt.a(list, ProductImageType.PRODUCT_SOCIAL_VALIDATION_URL) : null);
                }
            }
            this.this$0.E0(new za0(20, productConfigResponseAppModel, derivedPassSelectionScreenStateF0, passSelection));
        }
        return unit;
    }
}
