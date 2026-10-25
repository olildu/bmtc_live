package app.chalo.ncmc.data.cardtransactions;

import app.chalo.extensions.JsonElementExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.JsonContentPolymorphicSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/ncmc/data/cardtransactions/ChaloCardTransactionTypeDeserializer;", "Lkotlinx/serialization/json/JsonContentPolymorphicSerializer;", "Lapp/chalo/ncmc/data/cardtransactions/CardTransactionTypeApiResponse;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloCardTransactionTypeDeserializer extends JsonContentPolymorphicSerializer<CardTransactionTypeApiResponse> {
    public static final ChaloCardTransactionTypeDeserializer c = new ChaloCardTransactionTypeDeserializer(Reflection.a(CardTransactionTypeApiResponse.class));

    @Override // kotlinx.serialization.json.JsonContentPolymorphicSerializer
    public final DeserializationStrategy a(JsonElement element) {
        Intrinsics.i(element, "element");
        String strS = JsonElementExtensionsKt.s(JsonElementKt.g(element), "transactionType", "");
        if (StringsKt.x(strS, "CARD_RECHARGE", true)) {
            return CardTransactionTypeApiResponse.Recharge.INSTANCE.serializer();
        }
        if (StringsKt.x(strS, "TICKET", true)) {
            return CardTransactionTypeApiResponse.Ticket.INSTANCE.serializer();
        }
        if (StringsKt.x(strS, "PASS_ISSUE", true)) {
            return CardTransactionTypeApiResponse.PassPurchase.INSTANCE.serializer();
        }
        return StringsKt.x(strS, "MERCHANT_TRANSACTIONS", true) ? CardTransactionTypeApiResponse.MerchantTransaction.INSTANCE.serializer() : CardTransactionTypeApiResponse.Unknown.INSTANCE.serializer();
    }
}
