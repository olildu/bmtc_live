package app.chalo.ncmc.data.cardtransactions;

import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/ncmc/data/cardtransactions/CardRechargeTransactionApiResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/ncmc/data/cardtransactions/CardRechargeTransactionApiResponse;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class CardRechargeTransactionApiResponse$$serializer implements GeneratedSerializer<CardRechargeTransactionApiResponse> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CardRechargeTransactionApiResponse$$serializer f6173a;
    private static final SerialDescriptor descriptor;

    static {
        CardRechargeTransactionApiResponse$$serializer cardRechargeTransactionApiResponse$$serializer = new CardRechargeTransactionApiResponse$$serializer();
        f6173a = cardRechargeTransactionApiResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.ncmc.data.cardtransactions.CardRechargeTransactionApiResponse", cardRechargeTransactionApiResponse$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("transactionId", true);
        pluginGeneratedSerialDescriptor.j("transactionTime", true);
        pluginGeneratedSerialDescriptor.j("fareInfo", true);
        pluginGeneratedSerialDescriptor.j("paymentMode", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.c(StringSerializer.f18170a), BuiltinSerializersKt.c(LongSerializer.f18151a), BuiltinSerializersKt.c(CardTransactionFareInfoApiResponse$$serializer.f6189a), BuiltinSerializersKt.c((KSerializer) CardRechargeTransactionApiResponse.e[3].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        Long l;
        CardTransactionFareInfoApiResponse cardTransactionFareInfoApiResponse;
        CardRechargePaymentMode cardRechargePaymentMode;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = CardRechargeTransactionApiResponse.e;
        String str2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, null);
            Long l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.f18151a, null);
            CardTransactionFareInfoApiResponse cardTransactionFareInfoApiResponse2 = (CardTransactionFareInfoApiResponse) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, CardTransactionFareInfoApiResponse$$serializer.f6189a, null);
            cardRechargePaymentMode = (CardRechargePaymentMode) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), null);
            str = str3;
            cardTransactionFareInfoApiResponse = cardTransactionFareInfoApiResponse2;
            i = 15;
            l = l2;
        } else {
            boolean z = true;
            int i2 = 0;
            Long l3 = null;
            CardTransactionFareInfoApiResponse cardTransactionFareInfoApiResponse3 = null;
            CardRechargePaymentMode cardRechargePaymentMode2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.f18151a, l3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    cardTransactionFareInfoApiResponse3 = (CardTransactionFareInfoApiResponse) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, CardTransactionFareInfoApiResponse$$serializer.f6189a, cardTransactionFareInfoApiResponse3);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    cardRechargePaymentMode2 = (CardRechargePaymentMode) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), cardRechargePaymentMode2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str2;
            l = l3;
            cardTransactionFareInfoApiResponse = cardTransactionFareInfoApiResponse3;
            cardRechargePaymentMode = cardRechargePaymentMode2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CardRechargeTransactionApiResponse(i, str, l, cardTransactionFareInfoApiResponse, cardRechargePaymentMode);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        CardRechargeTransactionApiResponse value = (CardRechargeTransactionApiResponse) obj;
        Intrinsics.i(value, "value");
        CardRechargePaymentMode cardRechargePaymentMode = value.d;
        CardTransactionFareInfoApiResponse cardTransactionFareInfoApiResponse = value.c;
        Long l = value.b;
        String str = value.f6172a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = CardRechargeTransactionApiResponse.e;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || l != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.f18151a, l);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || cardTransactionFareInfoApiResponse != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, CardTransactionFareInfoApiResponse$$serializer.f6189a, cardTransactionFareInfoApiResponse);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || cardRechargePaymentMode != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, (SerializationStrategy) lazyArr[3].getValue(), cardRechargePaymentMode);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
