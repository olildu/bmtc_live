package app.chalo.bookingsuccess.data;

import app.chalo.models.SuperPassSubTypes;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/bookingsuccess/data/BulkBookingAcknowledgementData.OverlappingBookingFailure.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/bookingsuccess/data/BulkBookingAcknowledgementData$OverlappingBookingFailure;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class BulkBookingAcknowledgementData$OverlappingBookingFailure$$serializer implements GeneratedSerializer<BulkBookingAcknowledgementData.OverlappingBookingFailure> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BulkBookingAcknowledgementData$OverlappingBookingFailure$$serializer f1160a;
    private static final SerialDescriptor descriptor;

    static {
        BulkBookingAcknowledgementData$OverlappingBookingFailure$$serializer bulkBookingAcknowledgementData$OverlappingBookingFailure$$serializer = new BulkBookingAcknowledgementData$OverlappingBookingFailure$$serializer();
        f1160a = bulkBookingAcknowledgementData$OverlappingBookingFailure$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.bookingsuccess.data.BulkBookingAcknowledgementData.OverlappingBookingFailure", bulkBookingAcknowledgementData$OverlappingBookingFailure$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("errorMessage", false);
        pluginGeneratedSerialDescriptor.j("passId", false);
        pluginGeneratedSerialDescriptor.j("superPassSubType", false);
        pluginGeneratedSerialDescriptor.j("configId", false);
        pluginGeneratedSerialDescriptor.j("fareMappingId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = BulkBookingAcknowledgementData.OverlappingBookingFailure.g;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{BuiltinSerializersKt.c(stringSerializer), stringSerializer, lazyArr[2].getValue(), stringSerializer, IntSerializer.f18146a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int iDecodeIntElement;
        int i;
        String str;
        String str2;
        SuperPassSubTypes superPassSubTypes;
        String strDecodeStringElement;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = BulkBookingAcknowledgementData.OverlappingBookingFailure.g;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            superPassSubTypes = (SuperPassSubTypes) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), null);
            str = str3;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
            i = 31;
            str2 = strDecodeStringElement2;
        } else {
            boolean z = true;
            int iDecodeIntElement2 = 0;
            String str4 = null;
            String strDecodeStringElement3 = null;
            SuperPassSubTypes superPassSubTypes2 = null;
            String strDecodeStringElement4 = null;
            int i2 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str4);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    superPassSubTypes2 = (SuperPassSubTypes) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), superPassSubTypes2);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
                    i2 |= 16;
                }
            }
            iDecodeIntElement = iDecodeIntElement2;
            i = i2;
            str = str4;
            str2 = strDecodeStringElement3;
            superPassSubTypes = superPassSubTypes2;
            strDecodeStringElement = strDecodeStringElement4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new BulkBookingAcknowledgementData.OverlappingBookingFailure(i, str, str2, superPassSubTypes, strDecodeStringElement, iDecodeIntElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        BulkBookingAcknowledgementData.OverlappingBookingFailure value = (BulkBookingAcknowledgementData.OverlappingBookingFailure) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = BulkBookingAcknowledgementData.OverlappingBookingFailure.g;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, value.b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (SerializationStrategy) lazyArr[2].getValue(), value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.e);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 4, value.f);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
