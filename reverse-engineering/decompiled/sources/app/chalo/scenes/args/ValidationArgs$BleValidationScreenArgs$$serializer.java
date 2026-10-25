package app.chalo.scenes.args;

import app.chalo.models.validation.BleValidationArgs;
import app.chalo.models.validation.BleValidationArgs$$serializer;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/scenes/args/ValidationArgs.BleValidationScreenArgs.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/scenes/args/ValidationArgs$BleValidationScreenArgs;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class ValidationArgs$BleValidationScreenArgs$$serializer implements GeneratedSerializer<ValidationArgs.BleValidationScreenArgs> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ValidationArgs$BleValidationScreenArgs$$serializer f9340a;
    private static final SerialDescriptor descriptor;

    static {
        ValidationArgs$BleValidationScreenArgs$$serializer validationArgs$BleValidationScreenArgs$$serializer = new ValidationArgs$BleValidationScreenArgs$$serializer();
        f9340a = validationArgs$BleValidationScreenArgs$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.scenes.args.ValidationArgs.BleValidationScreenArgs", validationArgs$BleValidationScreenArgs$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("validationArgs", false);
        pluginGeneratedSerialDescriptor.j("_validationArgs", false);
        pluginGeneratedSerialDescriptor.j("isQRFirstBleEnabled", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        BleValidationArgs$$serializer bleValidationArgs$$serializer = BleValidationArgs$$serializer.f5693a;
        return new KSerializer[]{bleValidationArgs$$serializer, bleValidationArgs$$serializer, BooleanSerializer.f18123a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        boolean zDecodeBooleanElement;
        int i;
        BleValidationArgs bleValidationArgs;
        BleValidationArgs bleValidationArgs2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            BleValidationArgs$$serializer bleValidationArgs$$serializer = BleValidationArgs$$serializer.f5693a;
            bleValidationArgs = (BleValidationArgs) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, bleValidationArgs$$serializer, null);
            bleValidationArgs2 = (BleValidationArgs) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, bleValidationArgs$$serializer, null);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
            i = 7;
        } else {
            boolean z = true;
            boolean zDecodeBooleanElement2 = false;
            BleValidationArgs bleValidationArgs3 = null;
            BleValidationArgs bleValidationArgs4 = null;
            int i2 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    bleValidationArgs3 = (BleValidationArgs) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, BleValidationArgs$$serializer.f5693a, bleValidationArgs3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    bleValidationArgs4 = (BleValidationArgs) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, BleValidationArgs$$serializer.f5693a, bleValidationArgs4);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                    i2 |= 4;
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement2;
            i = i2;
            bleValidationArgs = bleValidationArgs3;
            bleValidationArgs2 = bleValidationArgs4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ValidationArgs.BleValidationScreenArgs(i, bleValidationArgs, bleValidationArgs2, zDecodeBooleanElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ValidationArgs.BleValidationScreenArgs value = (ValidationArgs.BleValidationScreenArgs) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ValidationArgs.BleValidationScreenArgs.Companion companion = ValidationArgs.BleValidationScreenArgs.INSTANCE;
        BleValidationArgs$$serializer bleValidationArgs$$serializer = BleValidationArgs$$serializer.f5693a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, bleValidationArgs$$serializer, value.b);
        BleValidationArgs bleValidationArgs = value.d;
        boolean z = value.e;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, bleValidationArgs$$serializer, bleValidationArgs);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 2, z);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
