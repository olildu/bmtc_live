package app.chalo.premiumbus.data.models.app;

import app.chalo.citydata.data.model.app.response.StopDetailsAppModel;
import app.chalo.citydata.data.model.app.response.StopDetailsAppModel$$serializer;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/premiumbus/data/models/app/FirstBookingAppModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/premiumbus/data/models/app/FirstBookingAppModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class FirstBookingAppModel$$serializer implements GeneratedSerializer<FirstBookingAppModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FirstBookingAppModel$$serializer f7083a;
    private static final SerialDescriptor descriptor;

    static {
        FirstBookingAppModel$$serializer firstBookingAppModel$$serializer = new FirstBookingAppModel$$serializer();
        f7083a = firstBookingAppModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.premiumbus.data.models.app.FirstBookingAppModel", firstBookingAppModel$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("bookingId", false);
        pluginGeneratedSerialDescriptor.j("tripStartTime", false);
        pluginGeneratedSerialDescriptor.j("tripSlotStartTime", false);
        pluginGeneratedSerialDescriptor.j("expiryTime", false);
        pluginGeneratedSerialDescriptor.j("fromStopDetails", false);
        pluginGeneratedSerialDescriptor.j("toStopDetails", false);
        pluginGeneratedSerialDescriptor.j("routeId", false);
        pluginGeneratedSerialDescriptor.j("routeName", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.f18170a;
        LongSerializer longSerializer = LongSerializer.f18151a;
        StopDetailsAppModel$$serializer stopDetailsAppModel$$serializer = StopDetailsAppModel$$serializer.f1746a;
        return new KSerializer[]{stringSerializer, longSerializer, longSerializer, longSerializer, stopDetailsAppModel$$serializer, stopDetailsAppModel$$serializer, stringSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        StopDetailsAppModel stopDetailsAppModel;
        String strDecodeStringElement;
        long j;
        String str;
        StopDetailsAppModel stopDetailsAppModel2;
        String str2;
        long j2;
        long j3;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
            StopDetailsAppModel$$serializer stopDetailsAppModel$$serializer = StopDetailsAppModel$$serializer.f1746a;
            StopDetailsAppModel stopDetailsAppModel3 = (StopDetailsAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, stopDetailsAppModel$$serializer, null);
            StopDetailsAppModel stopDetailsAppModel4 = (StopDetailsAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, stopDetailsAppModel$$serializer, null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            str = strDecodeStringElement3;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            str2 = strDecodeStringElement4;
            stopDetailsAppModel = stopDetailsAppModel4;
            i = 255;
            stopDetailsAppModel2 = stopDetailsAppModel3;
            j = jDecodeLongElement;
            j2 = jDecodeLongElement2;
            j3 = jDecodeLongElement3;
        } else {
            long jDecodeLongElement4 = 0;
            boolean z = true;
            int i2 = 0;
            StopDetailsAppModel stopDetailsAppModel5 = null;
            String strDecodeStringElement5 = null;
            StopDetailsAppModel stopDetailsAppModel6 = null;
            String strDecodeStringElement6 = null;
            long jDecodeLongElement5 = 0;
            long jDecodeLongElement6 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        i2 |= 1;
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        continue;
                    case 1:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
                        i2 |= 2;
                        continue;
                    case 2:
                        jDecodeLongElement5 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
                        i2 |= 4;
                        break;
                    case 3:
                        jDecodeLongElement6 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
                        i2 |= 8;
                        break;
                    case 4:
                        stopDetailsAppModel6 = (StopDetailsAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, StopDetailsAppModel$$serializer.f1746a, stopDetailsAppModel6);
                        i2 |= 16;
                        break;
                    case 5:
                        stopDetailsAppModel5 = (StopDetailsAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, StopDetailsAppModel$$serializer.f1746a, stopDetailsAppModel5);
                        i2 |= 32;
                        break;
                    case 6:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i2 |= 64;
                        break;
                    case 7:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i2 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i2;
            stopDetailsAppModel = stopDetailsAppModel5;
            strDecodeStringElement = strDecodeStringElement2;
            j = jDecodeLongElement4;
            str = strDecodeStringElement5;
            stopDetailsAppModel2 = stopDetailsAppModel6;
            str2 = strDecodeStringElement6;
            j2 = jDecodeLongElement5;
            j3 = jDecodeLongElement6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new FirstBookingAppModel(i, str, j, j2, j3, stopDetailsAppModel2, stopDetailsAppModel, str2, strDecodeStringElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        FirstBookingAppModel value = (FirstBookingAppModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f7082a);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 1, value.b);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 2, value.c);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 3, value.d);
        StopDetailsAppModel$$serializer stopDetailsAppModel$$serializer = StopDetailsAppModel$$serializer.f1746a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, stopDetailsAppModel$$serializer, value.e);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, stopDetailsAppModel$$serializer, value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.g);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 7, value.h);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
