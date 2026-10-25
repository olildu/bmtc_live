package app.chalo.domain;

import app.chalo.models.productbooking.productcapability.BookingFlowType;
import app.chalo.models.productbooking.productcapability.BookingSupport;
import app.chalo.models.productbooking.productcapability.BookingSupportAppModel;
import app.chalo.models.productbooking.productcapability.CapabilitiesApiModel;
import app.chalo.models.productbooking.productcapability.OperationalHoursApiModel;
import app.chalo.models.productbooking.productcapability.OperationalHoursAppModel;
import app.chalo.models.productbooking.productcapability.ProductCapabilitiesApiModel;
import app.chalo.models.productbooking.productcapability.ProductCapabilityAppModel;
import app.chalo.models.productbooking.productcapability.ProductValidationType;
import app.chalo.models.productbooking.productcapability.ValidationSupportApiModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/domain/GetProductCapabilitiesUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetProductCapabilitiesUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetProductCapabilitiesRemoteConfigUseCase f2500a;

    public GetProductCapabilitiesUseCase(GetProductCapabilitiesRemoteConfigUseCase getProductCapabilitiesRemoteConfigUseCase) {
        this.f2500a = getProductCapabilitiesRemoteConfigUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        GetProductCapabilitiesUseCase$invoke$1 getProductCapabilitiesUseCase$invoke$1;
        BookingFlowType next;
        if (continuationImpl instanceof GetProductCapabilitiesUseCase$invoke$1) {
            getProductCapabilitiesUseCase$invoke$1 = (GetProductCapabilitiesUseCase$invoke$1) continuationImpl;
            int i = getProductCapabilitiesUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getProductCapabilitiesUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getProductCapabilitiesUseCase$invoke$1 = new GetProductCapabilitiesUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getProductCapabilitiesUseCase$invoke$1 = new GetProductCapabilitiesUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = getProductCapabilitiesUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getProductCapabilitiesUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            getProductCapabilitiesUseCase$invoke$1.label = 1;
            objA = this.f2500a.a(str, str2, str3, getProductCapabilitiesUseCase$invoke$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        ProductCapabilitiesApiModel productCapabilitiesApiModel = (ProductCapabilitiesApiModel) objA;
        CapabilitiesApiModel capabilitiesApiModel = productCapabilitiesApiModel.e;
        Boolean bool = capabilitiesApiModel.f5670a;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        BookingSupport bookingSupport = capabilitiesApiModel.b;
        OperationalHoursAppModel operationalHoursAppModel = null;
        BookingSupportAppModel bookingSupportAppModel = bookingSupport != null ? new BookingSupportAppModel(bookingSupport.f5667a) : null;
        BookingFlowType.Companion companion = BookingFlowType.INSTANCE;
        String str4 = capabilitiesApiModel.c;
        companion.getClass();
        Iterator<BookingFlowType> it = BookingFlowType.getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(next.getFlowType(), str4));
        BookingFlowType bookingFlowType = next;
        List<ValidationSupportApiModel> list = capabilitiesApiModel.d;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
        for (ValidationSupportApiModel validationSupportApiModel : list) {
            if (!(validationSupportApiModel instanceof ValidationSupportApiModel.QR)) {
                throw new NoWhenBranchMatchedException();
            }
            arrayList.add(new ProductValidationType.Qr(((ValidationSupportApiModel.QR) validationSupportApiModel).b));
        }
        OperationalHoursApiModel operationalHoursApiModel = productCapabilitiesApiModel.f;
        if (operationalHoursApiModel != null && !StringsKt.F(operationalHoursApiModel.f5672a)) {
            long j = operationalHoursApiModel.b;
            if (j > 0) {
                long j2 = operationalHoursApiModel.c;
                if (j2 > 0) {
                    operationalHoursAppModel = new OperationalHoursAppModel(operationalHoursApiModel.f5672a, j, j2);
                }
            }
        }
        return new ProductCapabilityAppModel(zBooleanValue, bookingSupportAppModel, bookingFlowType, arrayList, operationalHoursAppModel);
    }
}
