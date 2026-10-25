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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/scenes/args/ValidationArgs.QrValidationScreenArgs.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/scenes/args/ValidationArgs$QrValidationScreenArgs;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class ValidationArgs$QrValidationScreenArgs$$serializer implements GeneratedSerializer<ValidationArgs.QrValidationScreenArgs> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ValidationArgs$QrValidationScreenArgs$$serializer f9343a;
    private static final SerialDescriptor descriptor;

    static {
        ValidationArgs$QrValidationScreenArgs$$serializer validationArgs$QrValidationScreenArgs$$serializer = new ValidationArgs$QrValidationScreenArgs$$serializer();
        f9343a = validationArgs$QrValidationScreenArgs$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.scenes.args.ValidationArgs.QrValidationScreenArgs", validationArgs$QrValidationScreenArgs$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("validationArgs", false);
        pluginGeneratedSerialDescriptor.j("_validationArgs", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        BleValidationArgs$$serializer bleValidationArgs$$serializer = BleValidationArgs$$serializer.f5693a;
        return new KSerializer[]{bleValidationArgs$$serializer, bleValidationArgs$$serializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        BleValidationArgs bleValidationArgs;
        BleValidationArgs bleValidationArgs2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        BleValidationArgs bleValidationArgs3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            BleValidationArgs$$serializer bleValidationArgs$$serializer = BleValidationArgs$$serializer.f5693a;
            bleValidationArgs = (BleValidationArgs) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, bleValidationArgs$$serializer, null);
            bleValidationArgs2 = (BleValidationArgs) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, bleValidationArgs$$serializer, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            BleValidationArgs bleValidationArgs4 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    bleValidationArgs3 = (BleValidationArgs) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, BleValidationArgs$$serializer.f5693a, bleValidationArgs3);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    bleValidationArgs4 = (BleValidationArgs) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, BleValidationArgs$$serializer.f5693a, bleValidationArgs4);
                    i2 |= 2;
                }
            }
            i = i2;
            bleValidationArgs = bleValidationArgs3;
            bleValidationArgs2 = bleValidationArgs4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ValidationArgs.QrValidationScreenArgs(i, bleValidationArgs, bleValidationArgs2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ValidationArgs.QrValidationScreenArgs value = (ValidationArgs.QrValidationScreenArgs) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ValidationArgs.QrValidationScreenArgs.Companion companion = ValidationArgs.QrValidationScreenArgs.INSTANCE;
        BleValidationArgs$$serializer bleValidationArgs$$serializer = BleValidationArgs$$serializer.f5693a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, bleValidationArgs$$serializer, value.b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, bleValidationArgs$$serializer, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
