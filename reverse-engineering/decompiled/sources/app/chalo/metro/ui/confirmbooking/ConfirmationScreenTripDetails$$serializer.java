package app.chalo.metro.ui.confirmbooking;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.citydata.data.model.app.StopAppModel$$serializer;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/metro/ui/confirmbooking/ConfirmationScreenTripDetails.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/metro/ui/confirmbooking/ConfirmationScreenTripDetails;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class ConfirmationScreenTripDetails$$serializer implements GeneratedSerializer<ConfirmationScreenTripDetails> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConfirmationScreenTripDetails$$serializer f5473a;
    private static final SerialDescriptor descriptor;

    static {
        ConfirmationScreenTripDetails$$serializer confirmationScreenTripDetails$$serializer = new ConfirmationScreenTripDetails$$serializer();
        f5473a = confirmationScreenTripDetails$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.metro.ui.confirmbooking.ConfirmationScreenTripDetails", confirmationScreenTripDetails$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("fromStop", false);
        pluginGeneratedSerialDescriptor.j("toStop", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StopAppModel$$serializer stopAppModel$$serializer = StopAppModel$$serializer.f1728a;
        return new KSerializer[]{stopAppModel$$serializer, stopAppModel$$serializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        StopAppModel stopAppModel;
        StopAppModel stopAppModel2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        StopAppModel stopAppModel3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StopAppModel$$serializer stopAppModel$$serializer = StopAppModel$$serializer.f1728a;
            stopAppModel = (StopAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, stopAppModel$$serializer, null);
            stopAppModel2 = (StopAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, stopAppModel$$serializer, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            StopAppModel stopAppModel4 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    stopAppModel3 = (StopAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, StopAppModel$$serializer.f1728a, stopAppModel3);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    stopAppModel4 = (StopAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, StopAppModel$$serializer.f1728a, stopAppModel4);
                    i2 |= 2;
                }
            }
            i = i2;
            stopAppModel = stopAppModel3;
            stopAppModel2 = stopAppModel4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ConfirmationScreenTripDetails(i, stopAppModel, stopAppModel2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ConfirmationScreenTripDetails value = (ConfirmationScreenTripDetails) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        StopAppModel$$serializer stopAppModel$$serializer = StopAppModel$$serializer.f1728a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, stopAppModel$$serializer, value.f5472a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, stopAppModel$$serializer, value.b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
