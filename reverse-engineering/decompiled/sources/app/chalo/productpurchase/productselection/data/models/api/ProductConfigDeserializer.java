package app.chalo.productpurchase.productselection.data.models.api;

import app.chalo.extensions.JsonElementExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.JsonContentPolymorphicSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigDeserializer;", "Lkotlinx/serialization/json/JsonContentPolymorphicSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductConfigDeserializer extends JsonContentPolymorphicSerializer<ProductConfigApiResponseModel> {
    public static final ProductConfigDeserializer c = new ProductConfigDeserializer(Reflection.a(ProductConfigApiResponseModel.class));

    @Override // kotlinx.serialization.json.JsonContentPolymorphicSerializer
    public final DeserializationStrategy a(JsonElement element) {
        Intrinsics.i(element, "element");
        JsonObject jsonObjectG = JsonElementKt.g(element);
        String strS = JsonElementExtensionsKt.s(jsonObjectG, "productType", "");
        String strS2 = JsonElementExtensionsKt.s(jsonObjectG, "productSubType", "");
        if (Intrinsics.d(strS, "mobileTicket") && Intrinsics.d(strS2, "instantTicket")) {
            return ProductConfigApiResponseModel.InstantTicketConfigurationApiModel.INSTANCE.serializer();
        }
        if (Intrinsics.d(strS, "mobileTicket") && Intrinsics.d(strS2, "multiModalTicket")) {
            return ProductConfigApiResponseModel.GroupTicketConfigurationApiModel.INSTANCE.serializer();
        }
        if (Intrinsics.d(strS, "singleJourneyTicket") && Intrinsics.d(strS2, "singleJourneyTicket")) {
            return ProductConfigApiResponseModel.SingleJourneyTicketApiModel.INSTANCE.serializer();
        }
        if (Intrinsics.d(strS, "superPass")) {
            return ProductConfigApiResponseModel.SuperPassConfigApiResponseModel.INSTANCE.serializer();
        }
        if (Intrinsics.d(strS, "quickpay")) {
            return ProductConfigApiResponseModel.QuickPayConfigApiResponseModel.INSTANCE.serializer();
        }
        return Intrinsics.d(strS, "cardRecharge") ? ProductConfigApiResponseModel.CardRechargeConfigApiResponseModel.INSTANCE.serializer() : ProductConfigApiResponseModel.UnknownProductConfigApiResponseModel.INSTANCE.serializer();
    }
}
