package app.chalo.scenes.args;

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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/scenes/args/PremiumBusArgs.PremiumProductSelectionArgs.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/scenes/args/PremiumBusArgs$PremiumProductSelectionArgs;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class PremiumBusArgs$PremiumProductSelectionArgs$$serializer implements GeneratedSerializer<PremiumBusArgs.PremiumProductSelectionArgs> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PremiumBusArgs$PremiumProductSelectionArgs$$serializer f9288a;
    private static final SerialDescriptor descriptor;

    static {
        PremiumBusArgs$PremiumProductSelectionArgs$$serializer premiumBusArgs$PremiumProductSelectionArgs$$serializer = new PremiumBusArgs$PremiumProductSelectionArgs$$serializer();
        f9288a = premiumBusArgs$PremiumProductSelectionArgs$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.scenes.args.PremiumBusArgs.PremiumProductSelectionArgs", premiumBusArgs$PremiumProductSelectionArgs$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("premiumBusProductPurchaseFlowType", true);
        pluginGeneratedSerialDescriptor.j("selectedODPair", true);
        pluginGeneratedSerialDescriptor.j("premiumBusProductSelectionConfig", true);
        pluginGeneratedSerialDescriptor.j("deeplinkAttribution", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), PremiumBusProductSelectionConfig$$serializer.f9296a, BuiltinSerializersKt.c(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        String str2;
        PremiumBusProductSelectionConfig premiumBusProductSelectionConfig;
        String str3;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String str4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            PremiumBusProductSelectionConfig premiumBusProductSelectionConfig2 = (PremiumBusProductSelectionConfig) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, PremiumBusProductSelectionConfig$$serializer.f9296a, null);
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            i = 15;
            premiumBusProductSelectionConfig = premiumBusProductSelectionConfig2;
            str2 = str6;
            str = str5;
        } else {
            boolean z = true;
            int i2 = 0;
            String str7 = null;
            PremiumBusProductSelectionConfig premiumBusProductSelectionConfig3 = null;
            String str8 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str4);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str7);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    premiumBusProductSelectionConfig3 = (PremiumBusProductSelectionConfig) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, PremiumBusProductSelectionConfig$$serializer.f9296a, premiumBusProductSelectionConfig3);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str8);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str4;
            str2 = str7;
            premiumBusProductSelectionConfig = premiumBusProductSelectionConfig3;
            str3 = str8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PremiumBusArgs.PremiumProductSelectionArgs(i, str, str2, premiumBusProductSelectionConfig, str3);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        PremiumBusArgs.PremiumProductSelectionArgs value = (PremiumBusArgs.PremiumProductSelectionArgs) obj;
        Intrinsics.i(value, "value");
        String str = value.f;
        PremiumBusProductSelectionConfig premiumBusProductSelectionConfig = value.e;
        String str2 = value.d;
        String str3 = value.c;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PremiumBusArgs.PremiumProductSelectionArgs.Companion companion = PremiumBusArgs.PremiumProductSelectionArgs.INSTANCE;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.d(premiumBusProductSelectionConfig, new PremiumBusProductSelectionConfig(false, 7))) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, PremiumBusProductSelectionConfig$$serializer.f9296a, premiumBusProductSelectionConfig);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
