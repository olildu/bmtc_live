package app.chalo.ncmc.data.apiresponsemodel;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/ncmc/data/apiresponsemodel/SemiClosedCardDetailsApiResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/ncmc/data/apiresponsemodel/SemiClosedCardDetailsApiResponse;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class SemiClosedCardDetailsApiResponse$$serializer implements GeneratedSerializer<SemiClosedCardDetailsApiResponse> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SemiClosedCardDetailsApiResponse$$serializer f6108a;
    private static final SerialDescriptor descriptor;

    static {
        SemiClosedCardDetailsApiResponse$$serializer semiClosedCardDetailsApiResponse$$serializer = new SemiClosedCardDetailsApiResponse$$serializer();
        f6108a = semiClosedCardDetailsApiResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.ncmc.data.apiresponsemodel.SemiClosedCardDetailsApiResponse", semiClosedCardDetailsApiResponse$$serializer, 10);
        pluginGeneratedSerialDescriptor.j("cardId", true);
        pluginGeneratedSerialDescriptor.j("isCardRechargeEnabled", true);
        pluginGeneratedSerialDescriptor.j("rechargeLimit", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("cardIssueDate", true);
        pluginGeneratedSerialDescriptor.j("cardBalance", false);
        pluginGeneratedSerialDescriptor.j("cvv", true);
        pluginGeneratedSerialDescriptor.j("isCardBlocked", true);
        pluginGeneratedSerialDescriptor.j("isEligibleForUnlink", true);
        pluginGeneratedSerialDescriptor.j("isEligibleToBlockCard", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(booleanSerializer);
        LongSerializer longSerializer = LongSerializer.f18151a;
        return new KSerializer[]{kSerializerC, kSerializerC2, BuiltinSerializersKt.c(longSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(longSerializer), IntSerializer.f18146a, BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c(booleanSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        Boolean bool;
        Boolean bool2;
        String str;
        Boolean bool3;
        Long l;
        String str2;
        Long l2;
        int i2;
        String str3;
        Boolean bool4;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 9;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, booleanSerializer, null);
            LongSerializer longSerializer = LongSerializer.f18151a;
            Long l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, longSerializer, null);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            Long l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, longSerializer, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            Boolean bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, booleanSerializer, null);
            Boolean bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            str = str6;
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, booleanSerializer, null);
            bool3 = bool6;
            bool2 = bool7;
            i = iDecodeIntElement;
            str2 = str5;
            i2 = 1023;
            l = l4;
            l2 = l3;
            bool4 = bool5;
            str3 = str4;
        } else {
            boolean z = true;
            int iDecodeIntElement2 = 0;
            Boolean bool8 = null;
            Boolean bool9 = null;
            String str7 = null;
            Boolean bool10 = null;
            Long l5 = null;
            String str8 = null;
            String str9 = null;
            Boolean bool11 = null;
            int i4 = 0;
            Long l6 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str9);
                        i4 |= 1;
                        i3 = 9;
                        break;
                    case 1:
                        bool11 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.f18123a, bool11);
                        i4 |= 2;
                        i3 = 9;
                        break;
                    case 2:
                        l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.f18151a, l6);
                        i4 |= 4;
                        i3 = 9;
                        break;
                    case 3:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str8);
                        i4 |= 8;
                        i3 = 9;
                        break;
                    case 4:
                        l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.f18151a, l5);
                        i4 |= 16;
                        i3 = 9;
                        break;
                    case 5:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
                        i4 |= 32;
                        i3 = 9;
                        break;
                    case 6:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str7);
                        i4 |= 64;
                        i3 = 9;
                        break;
                    case 7:
                        bool10 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.f18123a, bool10);
                        i4 |= 128;
                        i3 = 9;
                        break;
                    case 8:
                        bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.f18123a, bool9);
                        i4 |= 256;
                        break;
                    case 9:
                        bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, BooleanSerializer.f18123a, bool8);
                        i4 |= 512;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = iDecodeIntElement2;
            bool = bool8;
            bool2 = bool9;
            str = str7;
            bool3 = bool10;
            l = l5;
            str2 = str8;
            l2 = l6;
            i2 = i4;
            str3 = str9;
            bool4 = bool11;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SemiClosedCardDetailsApiResponse(i2, str3, bool4, l2, str2, l, i, str, bool3, bool2, bool);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        SemiClosedCardDetailsApiResponse value = (SemiClosedCardDetailsApiResponse) obj;
        Intrinsics.i(value, "value");
        Long l = value.e;
        String str = value.d;
        Long l2 = value.c;
        Boolean bool = value.b;
        String str2 = value.f6107a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || bool != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.f18123a, bool);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || l2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.f18151a, l2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || l != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.f18151a, l);
        }
        int i = value.f;
        Boolean bool2 = value.j;
        Boolean bool3 = value.i;
        Boolean bool4 = value.h;
        String str3 = value.g;
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 5, i);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || bool4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.f18123a, bool4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || bool3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.f18123a, bool3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9) || bool2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.f18123a, bool2);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
