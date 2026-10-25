package app.chalo.premiumbus.data;

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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/premiumbus/data/SuperPassWrapper.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/premiumbus/data/SuperPassWrapper;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class SuperPassWrapper$$serializer implements GeneratedSerializer<SuperPassWrapper> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SuperPassWrapper$$serializer f6979a;
    private static final SerialDescriptor descriptor;

    static {
        SuperPassWrapper$$serializer superPassWrapper$$serializer = new SuperPassWrapper$$serializer();
        f6979a = superPassWrapper$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.premiumbus.data.SuperPassWrapper", superPassWrapper$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("superPassProperties", false);
        pluginGeneratedSerialDescriptor.j("superPassUiProperties", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{SuperPassPropertiesAppModel$$serializer.f6968a, SuperPassUiPropertiesAppModel$$serializer.f6974a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        SuperPassPropertiesAppModel superPassPropertiesAppModel;
        SuperPassUiPropertiesAppModel superPassUiPropertiesAppModel;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        SuperPassPropertiesAppModel superPassPropertiesAppModel2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            superPassPropertiesAppModel = (SuperPassPropertiesAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, SuperPassPropertiesAppModel$$serializer.f6968a, null);
            superPassUiPropertiesAppModel = (SuperPassUiPropertiesAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, SuperPassUiPropertiesAppModel$$serializer.f6974a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            SuperPassUiPropertiesAppModel superPassUiPropertiesAppModel2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    superPassPropertiesAppModel2 = (SuperPassPropertiesAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, SuperPassPropertiesAppModel$$serializer.f6968a, superPassPropertiesAppModel2);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    superPassUiPropertiesAppModel2 = (SuperPassUiPropertiesAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, SuperPassUiPropertiesAppModel$$serializer.f6974a, superPassUiPropertiesAppModel2);
                    i2 |= 2;
                }
            }
            i = i2;
            superPassPropertiesAppModel = superPassPropertiesAppModel2;
            superPassUiPropertiesAppModel = superPassUiPropertiesAppModel2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SuperPassWrapper(i, superPassPropertiesAppModel, superPassUiPropertiesAppModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        SuperPassWrapper value = (SuperPassWrapper) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, SuperPassPropertiesAppModel$$serializer.f6968a, value.f6978a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, SuperPassUiPropertiesAppModel$$serializer.f6974a, value.b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
