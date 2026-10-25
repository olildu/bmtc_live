package app.chalo.productbooking.common.data.models.api.response;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/productbooking/common/data/models/api/response/FirstBookingApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/productbooking/common/data/models/api/response/FirstBookingApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class FirstBookingApiModel$$serializer implements GeneratedSerializer<FirstBookingApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FirstBookingApiModel$$serializer f8119a;
    private static final SerialDescriptor descriptor;

    static {
        FirstBookingApiModel$$serializer firstBookingApiModel$$serializer = new FirstBookingApiModel$$serializer();
        f8119a = firstBookingApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.productbooking.common.data.models.api.response.FirstBookingApiModel", firstBookingApiModel$$serializer, 8);
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
        MobileTicketProductStopDetailsApiModel$$serializer mobileTicketProductStopDetailsApiModel$$serializer = MobileTicketProductStopDetailsApiModel$$serializer.f8133a;
        return new KSerializer[]{BuiltinSerializersKt.c(stringSerializer), longSerializer, longSerializer, longSerializer, mobileTicketProductStopDetailsApiModel$$serializer, mobileTicketProductStopDetailsApiModel$$serializer, stringSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        MobileTicketProductStopDetailsApiModel mobileTicketProductStopDetailsApiModel;
        String strDecodeStringElement;
        long j;
        String str;
        MobileTicketProductStopDetailsApiModel mobileTicketProductStopDetailsApiModel2;
        String str2;
        long j2;
        long j3;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 7;
        int i3 = 6;
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, null);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
            MobileTicketProductStopDetailsApiModel$$serializer mobileTicketProductStopDetailsApiModel$$serializer = MobileTicketProductStopDetailsApiModel$$serializer.f8133a;
            MobileTicketProductStopDetailsApiModel mobileTicketProductStopDetailsApiModel3 = (MobileTicketProductStopDetailsApiModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, mobileTicketProductStopDetailsApiModel$$serializer, null);
            MobileTicketProductStopDetailsApiModel mobileTicketProductStopDetailsApiModel4 = (MobileTicketProductStopDetailsApiModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, mobileTicketProductStopDetailsApiModel$$serializer, null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            str = str3;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            str2 = strDecodeStringElement3;
            mobileTicketProductStopDetailsApiModel = mobileTicketProductStopDetailsApiModel4;
            i = 255;
            mobileTicketProductStopDetailsApiModel2 = mobileTicketProductStopDetailsApiModel3;
            j = jDecodeLongElement;
            j2 = jDecodeLongElement2;
            j3 = jDecodeLongElement3;
        } else {
            long jDecodeLongElement4 = 0;
            boolean z = true;
            int i4 = 0;
            MobileTicketProductStopDetailsApiModel mobileTicketProductStopDetailsApiModel5 = null;
            String str4 = null;
            MobileTicketProductStopDetailsApiModel mobileTicketProductStopDetailsApiModel6 = null;
            String strDecodeStringElement4 = null;
            long jDecodeLongElement5 = 0;
            long jDecodeLongElement6 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 6;
                        break;
                    case 0:
                        str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str4);
                        i4 |= 1;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 1:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
                        i4 |= 2;
                        break;
                    case 2:
                        jDecodeLongElement5 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
                        i4 |= 4;
                        break;
                    case 3:
                        jDecodeLongElement6 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
                        i4 |= 8;
                        break;
                    case 4:
                        mobileTicketProductStopDetailsApiModel6 = (MobileTicketProductStopDetailsApiModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, MobileTicketProductStopDetailsApiModel$$serializer.f8133a, mobileTicketProductStopDetailsApiModel6);
                        i4 |= 16;
                        break;
                    case 5:
                        mobileTicketProductStopDetailsApiModel5 = (MobileTicketProductStopDetailsApiModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, MobileTicketProductStopDetailsApiModel$$serializer.f8133a, mobileTicketProductStopDetailsApiModel5);
                        i4 |= 32;
                        break;
                    case 6:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        i4 |= 64;
                        break;
                    case 7:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        i4 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i4;
            mobileTicketProductStopDetailsApiModel = mobileTicketProductStopDetailsApiModel5;
            strDecodeStringElement = strDecodeStringElement2;
            j = jDecodeLongElement4;
            str = str4;
            mobileTicketProductStopDetailsApiModel2 = mobileTicketProductStopDetailsApiModel6;
            str2 = strDecodeStringElement4;
            j2 = jDecodeLongElement5;
            j3 = jDecodeLongElement6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new FirstBookingApiModel(i, str, j, j2, j3, mobileTicketProductStopDetailsApiModel2, mobileTicketProductStopDetailsApiModel, str2, strDecodeStringElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        FirstBookingApiModel value = (FirstBookingApiModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, value.f8118a);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 1, value.b);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 2, value.c);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 3, value.d);
        MobileTicketProductStopDetailsApiModel$$serializer mobileTicketProductStopDetailsApiModel$$serializer = MobileTicketProductStopDetailsApiModel$$serializer.f8133a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, mobileTicketProductStopDetailsApiModel$$serializer, value.e);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, mobileTicketProductStopDetailsApiModel$$serializer, value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.g);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 7, value.h);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
