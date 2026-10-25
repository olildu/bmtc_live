package app.chalo.features.productsync.model.api;

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
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/features/productsync/model/api/HistoryResponseApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/features/productsync/model/api/HistoryResponseApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class HistoryResponseApiModel$$serializer implements GeneratedSerializer<HistoryResponseApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HistoryResponseApiModel$$serializer f2749a;
    private static final SerialDescriptor descriptor;

    static {
        HistoryResponseApiModel$$serializer historyResponseApiModel$$serializer = new HistoryResponseApiModel$$serializer();
        f2749a = historyResponseApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.features.productsync.model.api.HistoryResponseApiModel", historyResponseApiModel$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("properties", false);
        pluginGeneratedSerialDescriptor.j("responseData", false);
        pluginGeneratedSerialDescriptor.j("userId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{PropertiesApiModel$$serializer.f2751a, BookingHistoryDataApiModel$$serializer.f2746a, StringSerializer.f18170a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        PropertiesApiModel propertiesApiModel;
        BookingHistoryDataApiModel bookingHistoryDataApiModel;
        String strDecodeStringElement;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        PropertiesApiModel propertiesApiModel2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            propertiesApiModel = (PropertiesApiModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, PropertiesApiModel$$serializer.f2751a, null);
            bookingHistoryDataApiModel = (BookingHistoryDataApiModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, BookingHistoryDataApiModel$$serializer.f2746a, null);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            BookingHistoryDataApiModel bookingHistoryDataApiModel2 = null;
            String strDecodeStringElement2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    propertiesApiModel2 = (PropertiesApiModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, PropertiesApiModel$$serializer.f2751a, propertiesApiModel2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    bookingHistoryDataApiModel2 = (BookingHistoryDataApiModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, BookingHistoryDataApiModel$$serializer.f2746a, bookingHistoryDataApiModel2);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i2 |= 4;
                }
            }
            i = i2;
            propertiesApiModel = propertiesApiModel2;
            bookingHistoryDataApiModel = bookingHistoryDataApiModel2;
            strDecodeStringElement = strDecodeStringElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new HistoryResponseApiModel(i, propertiesApiModel, bookingHistoryDataApiModel, strDecodeStringElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        HistoryResponseApiModel value = (HistoryResponseApiModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PropertiesApiModel$$serializer propertiesApiModel$$serializer = PropertiesApiModel$$serializer.f2751a;
        PropertiesApiModel propertiesApiModel = value.f2748a;
        String str = value.c;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, propertiesApiModel$$serializer, propertiesApiModel);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, BookingHistoryDataApiModel$$serializer.f2746a, value.b);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.d(str, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, str);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
