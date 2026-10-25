package app.chalo.titoridedetail.ui;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.constants.Source;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.tito.data.model.entity.TITOValidationEntityKt;
import app.chalo.titoridedetail.data.app.TITOProductDetailAppModel;
import app.chalo.titoridedetail.data.app.TITOProductType;
import app.chalo.titoridedetail.data.app.TITOValidationAppModel;
import app.chalo.titoridedetail.data.app.TitoRideDataAppModel;
import defpackage.wi1;
import kotlin.Metadata;
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
@DebugMetadata(c = "app.chalo.titoridedetail.ui.TitoRideDetailsComponent$handleTapOutCompleteBottomSheetViewReceiptButtonClickIntent$2", f = "TitoRideDetailComponent.kt", l = {452, 457, 459}, m = "invokeSuspend", v = 1)
final class TitoRideDetailsComponent$handleTapOutCompleteBottomSheetViewReceiptButtonClickIntent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ TitoRideDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TitoRideDetailsComponent$handleTapOutCompleteBottomSheetViewReceiptButtonClickIntent$2(TitoRideDetailsComponent titoRideDetailsComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = titoRideDetailsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TitoRideDetailsComponent$handleTapOutCompleteBottomSheetViewReceiptButtonClickIntent$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TitoRideDetailsComponent$handleTapOutCompleteBottomSheetViewReceiptButtonClickIntent$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0100 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ValidationProduct validationProduct;
        TITOValidationAppModel tITOValidationAppModel;
        KotlinToastManager kotlinToastManager;
        ValidationProduct validationProduct2;
        ValidationProduct validationProduct3;
        TITOProductType tITOProductTypeB;
        TITOValidationAppModel tITOValidationAppModel2;
        TitoRideDetailsComponent titoRideDetailsComponent;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            TitoRideDataAppModel titoRideDataAppModel = ((TitoRideDetailsViewState) this.this$0.f.getValue()).f9723a;
            TITOProductDetailAppModel tITOProductDetailAppModel = (titoRideDataAppModel == null || (tITOValidationAppModel2 = titoRideDataAppModel.f9677a) == null) ? null : tITOValidationAppModel2.c;
            TitoRideDetailsComponent titoRideDetailsComponent2 = this.this$0;
            AnalyticsContractImplKt.a(titoRideDetailsComponent2.k, "missed tap out done bottom sheet view receipt btn click", Source.TITO_RIDE_DETAIL_SCREEN, titoRideDetailsComponent2.J, MapsKt.i(new Pair("productType", String.valueOf((tITOProductDetailAppModel == null || (validationProduct3 = tITOProductDetailAppModel.b) == null || (tITOProductTypeB = TITOValidationEntityKt.b(validationProduct3)) == null) ? null : tITOProductTypeB.name())), new Pair("bookingId", String.valueOf((tITOProductDetailAppModel == null || (validationProduct2 = tITOProductDetailAppModel.b) == null) ? null : validationProduct2.getC()))), 48);
            TitoRideDataAppModel titoRideDataAppModel2 = ((TitoRideDetailsViewState) this.this$0.f.getValue()).f9723a;
            TITOValidationAppModel tITOValidationAppModel3 = titoRideDataAppModel2 != null ? titoRideDataAppModel2.f9677a : null;
            if (tITOValidationAppModel3 == null) {
                TitoRideDetailsComponent titoRideDetailsComponent3 = this.this$0;
                KotlinToastManager kotlinToastManager2 = titoRideDetailsComponent3.D;
                this.L$0 = kotlinToastManager2;
                this.label = 1;
                obj = titoRideDetailsComponent3.E.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
                if (obj != coroutineSingletons) {
                    kotlinToastManager = kotlinToastManager2;
                    KotlinToastManagerKt.a(kotlinToastManager, (String) obj, ToastLength.LONG);
                    return unit;
                }
            } else {
                validationProduct = tITOValidationAppModel3.c.b;
                TitoRideDetailsComponent titoRideDetailsComponent4 = this.this$0;
                this.L$0 = tITOValidationAppModel3;
                this.L$1 = validationProduct;
                this.label = 2;
                Object objF = titoRideDetailsComponent4.r.f(validationProduct, this);
                if (objF != coroutineSingletons) {
                    objF = unit;
                }
                if (objF != coroutineSingletons) {
                    tITOValidationAppModel = tITOValidationAppModel3;
                    this.this$0.E0(new wi1(28));
                    titoRideDetailsComponent = this.this$0;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                    if (TitoRideDetailsComponent.H0(titoRideDetailsComponent, tITOValidationAppModel, validationProduct, this) == coroutineSingletons) {
                        return unit;
                    }
                }
            }
        } else {
            if (i == 1) {
                kotlinToastManager = (KotlinToastManager) this.L$0;
                ResultKt.b(obj);
                KotlinToastManagerKt.a(kotlinToastManager, (String) obj, ToastLength.LONG);
                return unit;
            }
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return unit;
            }
            validationProduct = (ValidationProduct) this.L$1;
            tITOValidationAppModel = (TITOValidationAppModel) this.L$0;
            ResultKt.b(obj);
            this.this$0.E0(new wi1(28));
            titoRideDetailsComponent = this.this$0;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
            if (TitoRideDetailsComponent.H0(titoRideDetailsComponent, tITOValidationAppModel, validationProduct, this) == coroutineSingletons) {
                return unit;
            }
        }
        return coroutineSingletons;
    }
}
