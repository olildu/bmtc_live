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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/ncmc/data/cardtransactions/CardTicketTransactionApiResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/ncmc/data/cardtransactions/CardTicketTransactionApiResponse;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class CardTicketTransactionApiResponse$$serializer implements GeneratedSerializer<CardTicketTransactionApiResponse> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CardTicketTransactionApiResponse$$serializer f6177a;
    private static final SerialDescriptor descriptor;

    static {
        CardTicketTransactionApiResponse$$serializer cardTicketTransactionApiResponse$$serializer = new CardTicketTransactionApiResponse$$serializer();
        f6177a = cardTicketTransactionApiResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.ncmc.data.cardtransactions.CardTicketTransactionApiResponse", cardTicketTransactionApiResponse$$serializer, 9);
        pluginGeneratedSerialDescriptor.j("transactionId", true);
        pluginGeneratedSerialDescriptor.j("transactionTime", true);
        pluginGeneratedSerialDescriptor.j("fareInfo", true);
        pluginGeneratedSerialDescriptor.j("paymentMode", true);
        pluginGeneratedSerialDescriptor.j("conductorId", true);
        pluginGeneratedSerialDescriptor.j("vehicleNo", true);
        pluginGeneratedSerialDescriptor.j("routeName", true);
        pluginGeneratedSerialDescriptor.j("startStopName", true);
        pluginGeneratedSerialDescriptor.j("endStopName", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = CardTicketTransactionApiResponse.j;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(LongSerializer.f18151a), BuiltinSerializersKt.c(CardTransactionFareInfoApiResponse$$serializer.f6189a), BuiltinSerializersKt.c((KSerializer) lazyArr[3].getValue()), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        CardTicketPaymentMode cardTicketPaymentMode;
        String str6;
        Long l;
        CardTransactionFareInfoApiResponse cardTransactionFareInfoApiResponse;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = CardTicketTransactionApiResponse.j;
        int i2 = 7;
        String str7 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            Long l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.f18151a, null);
            CardTransactionFareInfoApiResponse cardTransactionFareInfoApiResponse2 = (CardTransactionFareInfoApiResponse) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, CardTransactionFareInfoApiResponse$$serializer.f6189a, null);
            CardTicketPaymentMode cardTicketPaymentMode2 = (CardTicketPaymentMode) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            cardTicketPaymentMode = cardTicketPaymentMode2;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            str2 = str12;
            str4 = str11;
            str3 = str10;
            i = 511;
            str5 = str9;
            cardTransactionFareInfoApiResponse = cardTransactionFareInfoApiResponse2;
            l = l2;
            str6 = str8;
        } else {
            int i3 = 3;
            boolean z = true;
            int i4 = 0;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            CardTicketPaymentMode cardTicketPaymentMode3 = null;
            Long l3 = null;
            CardTransactionFareInfoApiResponse cardTransactionFareInfoApiResponse3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 7;
                        i3 = 3;
                        break;
                    case 0:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str7);
                        i4 |= 1;
                        i2 = 7;
                        i3 = 3;
                        break;
                    case 1:
                        l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.f18151a, l3);
                        i4 |= 2;
                        i2 = 7;
                        i3 = 3;
                        break;
                    case 2:
                        cardTransactionFareInfoApiResponse3 = (CardTransactionFareInfoApiResponse) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, CardTransactionFareInfoApiResponse$$serializer.f6189a, cardTransactionFareInfoApiResponse3);
                        i4 |= 4;
                        i2 = 7;
                        i3 = 3;
                        break;
                    case 3:
                        cardTicketPaymentMode3 = (CardTicketPaymentMode) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, (DeserializationStrategy) lazyArr[i3].getValue(), cardTicketPaymentMode3);
                        i4 |= 8;
                        i2 = 7;
                        break;
                    case 4:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str17);
                        i4 |= 16;
                        i2 = 7;
                        break;
                    case 5:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str15);
                        i4 |= 32;
                        i2 = 7;
                        break;
                    case 6:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str16);
                        i4 |= 64;
                        i2 = 7;
                        break;
                    case 7:
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.f18170a, str14);
                        i4 |= 128;
                        break;
                    case 8:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.f18170a, str13);
                        i4 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i4;
            str = str13;
            str2 = str14;
            str3 = str15;
            str4 = str16;
            str5 = str17;
            cardTicketPaymentMode = cardTicketPaymentMode3;
            str6 = str7;
            l = l3;
            cardTransactionFareInfoApiResponse = cardTransactionFareInfoApiResponse3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CardTicketTransactionApiResponse(i, str6, l, cardTransactionFareInfoApiResponse, cardTicketPaymentMode, str5, str3, str4, str2, str);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        CardTicketTransactionApiResponse value = (CardTicketTransactionApiResponse) obj;
        Intrinsics.i(value, "value");
        String str = value.i;
        String str2 = value.h;
        String str3 = value.g;
        String str4 = value.f;
        String str5 = value.e;
        CardTicketPaymentMode cardTicketPaymentMode = value.d;
        CardTransactionFareInfoApiResponse cardTransactionFareInfoApiResponse = value.c;
        Long l = value.b;
        String str6 = value.f6176a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = CardTicketTransactionApiResponse.j;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || str6 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str6);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || l != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.f18151a, l);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || cardTransactionFareInfoApiResponse != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, CardTransactionFareInfoApiResponse$$serializer.f6189a, cardTransactionFareInfoApiResponse);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || cardTicketPaymentMode != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, (SerializationStrategy) lazyArr[3].getValue(), cardTicketPaymentMode);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || str5 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str5);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || str4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.f18170a, str);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
