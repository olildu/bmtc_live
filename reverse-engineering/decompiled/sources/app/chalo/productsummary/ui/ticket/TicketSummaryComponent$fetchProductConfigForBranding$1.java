package app.chalo.productsummary.ui.ticket;

import app.chalo.instantticket.config.models.BrandingDetails;
import app.chalo.productbooking.common.data.models.app.ProductConfigCompleteDetailsAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigCompleteDetailsListAppModel;
import app.chalo.productbooking.common.data.models.app.ProductImageAppModel;
import app.chalo.productbooking.common.data.models.app.ProductImageType;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.usecase.GetProductConfigFromProductIdUseCase;
import defpackage.qi;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productsummary.ui.ticket.TicketSummaryComponent$fetchProductConfigForBranding$1", f = "TicketSummaryComponent.kt", l = {326}, m = "invokeSuspend", v = 1)
final class TicketSummaryComponent$fetchProductConfigForBranding$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $productId;
    int label;
    final /* synthetic */ TicketSummaryComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TicketSummaryComponent$fetchProductConfigForBranding$1(TicketSummaryComponent ticketSummaryComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ticketSummaryComponent;
        this.$productId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TicketSummaryComponent$fetchProductConfigForBranding$1(this.this$0, this.$productId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TicketSummaryComponent$fetchProductConfigForBranding$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        ProductConfigCompleteDetailsAppModel productConfigCompleteDetailsAppModel;
        ProductConfigCompleteDetailsAppModel productConfigCompleteDetailsAppModel2;
        ProductConfigCompleteDetailsAppModel productConfigCompleteDetailsAppModel3;
        ProductConfigCompleteDetailsAppModel productConfigCompleteDetailsAppModel4;
        ProductConfigCompleteDetailsAppModel productConfigCompleteDetailsAppModel5;
        List list;
        Object next;
        ProductConfigCompleteDetailsAppModel productConfigCompleteDetailsAppModel6;
        BrandingDetails brandingDetails;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            GetProductConfigFromProductIdUseCase getProductConfigFromProductIdUseCase = this.this$0.D;
            String str4 = this.$productId;
            this.label = 1;
            obj = getProductConfigFromProductIdUseCase.a(str4, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        ProductConfigCompleteDetailsListAppModel productConfigCompleteDetailsListAppModel = (ProductConfigCompleteDetailsListAppModel) obj;
        boolean z = false;
        if (productConfigCompleteDetailsListAppModel != null && (productConfigCompleteDetailsAppModel6 = productConfigCompleteDetailsListAppModel.f8205a) != null && (brandingDetails = productConfigCompleteDetailsAppModel6.h) != null && brandingDetails.f3827a) {
            z = true;
        }
        IconType iconType = null;
        if (productConfigCompleteDetailsListAppModel == null || (productConfigCompleteDetailsAppModel5 = productConfigCompleteDetailsListAppModel.f8205a) == null || (list = productConfigCompleteDetailsAppModel5.I) == null) {
            str = null;
        } else {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((ProductImageAppModel) next).b != ProductImageType.AGENCY_BRANDING_URL);
            ProductImageAppModel productImageAppModel = (ProductImageAppModel) next;
            if (productImageAppModel != null) {
                str = productImageAppModel.f8224a;
            } else {
                str = null;
            }
        }
        if (z && str == null) {
            if (StringsKt.x((productConfigCompleteDetailsListAppModel == null || (productConfigCompleteDetailsAppModel4 = productConfigCompleteDetailsListAppModel.f8205a) == null) ? null : productConfigCompleteDetailsAppModel4.b, "bengaluru", true)) {
                if (StringsKt.x((productConfigCompleteDetailsListAppModel == null || (productConfigCompleteDetailsAppModel3 = productConfigCompleteDetailsListAppModel.f8205a) == null) ? null : productConfigCompleteDetailsAppModel3.g, "bmtc", true)) {
                    iconType = IconType.IC_BMTC_LOGO;
                } else {
                    if (productConfigCompleteDetailsListAppModel != null) {
                        str2 = null;
                    } else {
                        str2 = null;
                    }
                    if (StringsKt.x(str2, "gurugram", true)) {
                        if (productConfigCompleteDetailsListAppModel != null) {
                            str3 = null;
                        } else {
                            str3 = null;
                        }
                        if (StringsKt.x(str3, "gmcbl", true)) {
                            iconType = IconType.IC_GMCBL_BRANDING_LOGO;
                        }
                    }
                }
            } else {
                if (productConfigCompleteDetailsListAppModel != null || (productConfigCompleteDetailsAppModel2 = productConfigCompleteDetailsListAppModel.f8205a) == null) {
                    str2 = null;
                } else {
                    str2 = productConfigCompleteDetailsAppModel2.b;
                }
                if (StringsKt.x(str2, "gurugram", true)) {
                    if (productConfigCompleteDetailsListAppModel != null || (productConfigCompleteDetailsAppModel = productConfigCompleteDetailsListAppModel.f8205a) == null) {
                        str3 = null;
                    } else {
                        str3 = productConfigCompleteDetailsAppModel.g;
                    }
                    if (StringsKt.x(str3, "gmcbl", true)) {
                        iconType = IconType.IC_GMCBL_BRANDING_LOGO;
                    }
                }
            }
        }
        this.this$0.E0(new qi(str, iconType, z, 12));
        return Unit.f17538a;
    }
}
