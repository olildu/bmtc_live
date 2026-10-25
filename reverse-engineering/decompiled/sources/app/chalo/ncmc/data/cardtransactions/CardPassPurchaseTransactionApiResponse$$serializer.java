package app.chalo.ncmc.data.cardtransactions;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/ncmc/data/cardtransactions/CardPassPurchaseTransactionApiResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/ncmc/data/cardtransactions/CardPassPurchaseTransactionApiResponse;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class CardPassPurchaseTransactionApiResponse$$serializer implements GeneratedSerializer<CardPassPurchaseTransactionApiResponse> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CardPassPurchaseTransactionApiResponse$$serializer f6169a;
    private static final SerialDescriptor descriptor;

    static {
        CardPassPurchaseTransactionApiResponse$$serializer cardPassPurchaseTransactionApiResponse$$serializer = new CardPassPurchaseTransactionApiResponse$$serializer();
        f6169a = cardPassPurchaseTransactionApiResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.ncmc.data.cardtransactions.CardPassPurchaseTransactionApiResponse", cardPassPurchaseTransactionApiResponse$$serializer, 11);
        pluginGeneratedSerialDescriptor.j("transactionId", true);
        pluginGeneratedSerialDescriptor.j("transactionTime", true);
        pluginGeneratedSerialDescriptor.j("fareInfo", true);
        pluginGeneratedSerialDescriptor.j("categoryName", true);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("expiryTime", true);
        pluginGeneratedSerialDescriptor.j("remainingTrips", true);
        pluginGeneratedSerialDescriptor.j("maxPricePerTrip", true);
        pluginGeneratedSerialDescriptor.j("maxTripsPerDay", true);
        pluginGeneratedSerialDescriptor.j("productType", true);
        pluginGeneratedSerialDescriptor.j("totalTrips", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(stringSerializer);
        LongSerializer longSerializer = LongSerializer.f18151a;
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(longSerializer);
        KSerializer kSerializerC3 = BuiltinSerializersKt.c(CardTransactionFareInfoApiResponse$$serializer.f6189a);
        KSerializer kSerializerC4 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC5 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC6 = BuiltinSerializersKt.c(longSerializer);
        IntSerializer intSerializer = IntSerializer.f18146a;
        return new KSerializer[]{kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, kSerializerC5, kSerializerC6, BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(stringSerializer), intSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int iDecodeIntElement;
        int i;
        Integer num;
        Integer num2;
        Integer num3;
        String str;
        String str2;
        Long l;
        String str3;
        CardTransactionFareInfoApiResponse cardTransactionFareInfoApiResponse;
        Long l2;
        String str4;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String str5 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            LongSerializer longSerializer = LongSerializer.f18151a;
            Long l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, longSerializer, null);
            CardTransactionFareInfoApiResponse cardTransactionFareInfoApiResponse2 = (CardTransactionFareInfoApiResponse) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, CardTransactionFareInfoApiResponse$$serializer.f6189a, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            Long l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, longSerializer, null);
            IntSerializer intSerializer = IntSerializer.f18146a;
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, intSerializer, null);
            Integer num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, intSerializer, null);
            Integer num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, intSerializer, null);
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            cardTransactionFareInfoApiResponse = cardTransactionFareInfoApiResponse2;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
            num2 = num5;
            num3 = num4;
            l = l4;
            str3 = str7;
            num = num6;
            str = str8;
            i = 2047;
            l2 = l3;
            str4 = str6;
        } else {
            int i2 = 10;
            boolean z = true;
            int iDecodeIntElement2 = 0;
            int i3 = 0;
            Integer num7 = null;
            Integer num8 = null;
            Integer num9 = null;
            String str9 = null;
            String str10 = null;
            Long l5 = null;
            String str11 = null;
            CardTransactionFareInfoApiResponse cardTransactionFareInfoApiResponse3 = null;
            Long l6 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 10;
                        break;
                    case 0:
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str5);
                        i3 |= 1;
                        i2 = 10;
                        break;
                    case 1:
                        l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.f18151a, l6);
                        i3 |= 2;
                        i2 = 10;
                        break;
                    case 2:
                        cardTransactionFareInfoApiResponse3 = (CardTransactionFareInfoApiResponse) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, CardTransactionFareInfoApiResponse$$serializer.f6189a, cardTransactionFareInfoApiResponse3);
                        i3 |= 4;
                        i2 = 10;
                        break;
                    case 3:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str11);
                        i3 |= 8;
                        i2 = 10;
                        break;
                    case 4:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str9);
                        i3 |= 16;
                        i2 = 10;
                        break;
                    case 5:
                        l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.f18151a, l5);
                        i3 |= 32;
                        i2 = 10;
                        break;
                    case 6:
                        num9 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.f18146a, num9);
                        i3 |= 64;
                        i2 = 10;
                        break;
                    case 7:
                        num8 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.f18146a, num8);
                        i3 |= 128;
                        i2 = 10;
                        break;
                    case 8:
                        num7 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, IntSerializer.f18146a, num7);
                        i3 |= 256;
                        i2 = 10;
                        break;
                    case 9:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.f18170a, str10);
                        i3 |= 512;
                        i2 = 10;
                        break;
                    case 10:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i2);
                        i3 |= 1024;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            iDecodeIntElement = iDecodeIntElement2;
            i = i3;
            num = num7;
            num2 = num8;
            num3 = num9;
            str = str9;
            str2 = str10;
            l = l5;
            str3 = str11;
            cardTransactionFareInfoApiResponse = cardTransactionFareInfoApiResponse3;
            l2 = l6;
            str4 = str5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CardPassPurchaseTransactionApiResponse(i, str4, l2, cardTransactionFareInfoApiResponse, str3, str, l, num3, num2, num, str2, iDecodeIntElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        CardPassPurchaseTransactionApiResponse value = (CardPassPurchaseTransactionApiResponse) obj;
        Intrinsics.i(value, "value");
        String str = value.j;
        Integer num = value.i;
        Integer num2 = value.h;
        Integer num3 = value.g;
        Long l = value.f;
        String str2 = value.e;
        String str3 = value.d;
        CardTransactionFareInfoApiResponse cardTransactionFareInfoApiResponse = value.c;
        Long l2 = value.b;
        String str4 = value.f6168a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || str4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || l2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.f18151a, l2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || cardTransactionFareInfoApiResponse != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, CardTransactionFareInfoApiResponse$$serializer.f6189a, cardTransactionFareInfoApiResponse);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || l != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.f18151a, l);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || num3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.f18146a, num3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || num2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.f18146a, num2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || num != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, IntSerializer.f18146a, num);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.f18170a, str);
        }
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 10, value.k);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
