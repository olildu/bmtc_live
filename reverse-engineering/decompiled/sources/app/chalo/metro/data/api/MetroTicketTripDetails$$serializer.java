package app.chalo.metro.data.api;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.citydata.data.model.app.StopAppModel$$serializer;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/metro/data/api/MetroTicketTripDetails.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/metro/data/api/MetroTicketTripDetails;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class MetroTicketTripDetails$$serializer implements GeneratedSerializer<MetroTicketTripDetails> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MetroTicketTripDetails$$serializer f5421a;
    private static final SerialDescriptor descriptor;

    static {
        MetroTicketTripDetails$$serializer metroTicketTripDetails$$serializer = new MetroTicketTripDetails$$serializer();
        f5421a = metroTicketTripDetails$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.metro.data.api.MetroTicketTripDetails", metroTicketTripDetails$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("startStop", false);
        pluginGeneratedSerialDescriptor.j("endStop", false);
        pluginGeneratedSerialDescriptor.j("routeId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = BuiltinSerializersKt.c(StringSerializer.f18170a);
        StopAppModel$$serializer stopAppModel$$serializer = StopAppModel$$serializer.f1728a;
        return new KSerializer[]{stopAppModel$$serializer, stopAppModel$$serializer, kSerializerC};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        StopAppModel stopAppModel;
        StopAppModel stopAppModel2;
        String str;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        StopAppModel stopAppModel3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StopAppModel$$serializer stopAppModel$$serializer = StopAppModel$$serializer.f1728a;
            stopAppModel = (StopAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, stopAppModel$$serializer, null);
            stopAppModel2 = (StopAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, stopAppModel$$serializer, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            StopAppModel stopAppModel4 = null;
            String str2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    stopAppModel3 = (StopAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, StopAppModel$$serializer.f1728a, stopAppModel3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    stopAppModel4 = (StopAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, StopAppModel$$serializer.f1728a, stopAppModel4);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str2);
                    i2 |= 4;
                }
            }
            i = i2;
            stopAppModel = stopAppModel3;
            stopAppModel2 = stopAppModel4;
            str = str2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MetroTicketTripDetails(i, stopAppModel, stopAppModel2, str);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        MetroTicketTripDetails value = (MetroTicketTripDetails) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        StopAppModel$$serializer stopAppModel$$serializer = StopAppModel$$serializer.f1728a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, stopAppModel$$serializer, value.f5420a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, stopAppModel$$serializer, value.b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, value.c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
