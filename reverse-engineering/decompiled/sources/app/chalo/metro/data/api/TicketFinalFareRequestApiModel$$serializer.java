package app.chalo.metro.data.api;

import app.chalo.productbooking.common.data.models.api.request.TicketBookingTripDetailsApiModel;
import app.chalo.productbooking.common.data.models.api.request.TicketBookingTripDetailsApiModel$$serializer;
import java.util.List;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/metro/data/api/TicketFinalFareRequestApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/metro/data/api/TicketFinalFareRequestApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class TicketFinalFareRequestApiModel$$serializer implements GeneratedSerializer<TicketFinalFareRequestApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TicketFinalFareRequestApiModel$$serializer f5427a;
    private static final SerialDescriptor descriptor;

    static {
        TicketFinalFareRequestApiModel$$serializer ticketFinalFareRequestApiModel$$serializer = new TicketFinalFareRequestApiModel$$serializer();
        f5427a = ticketFinalFareRequestApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.metro.data.api.TicketFinalFareRequestApiModel", ticketFinalFareRequestApiModel$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("ticketType", false);
        pluginGeneratedSerialDescriptor.j("transitMode", false);
        pluginGeneratedSerialDescriptor.j("configurationId", false);
        pluginGeneratedSerialDescriptor.j("city", false);
        pluginGeneratedSerialDescriptor.j("passengerDetails", false);
        pluginGeneratedSerialDescriptor.j("tripDetail", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = TicketFinalFareRequestApiModel.g;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{BuiltinSerializersKt.c(stringSerializer), stringSerializer, stringSerializer, stringSerializer, lazyArr[4].getValue(), TicketBookingTripDetailsApiModel$$serializer.f8109a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        List list;
        TicketBookingTripDetailsApiModel ticketBookingTripDetailsApiModel;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = TicketFinalFareRequestApiModel.g;
        int i2 = 5;
        String str5 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), null);
            str = str6;
            ticketBookingTripDetailsApiModel = (TicketBookingTripDetailsApiModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, TicketBookingTripDetailsApiModel$$serializer.f8109a, null);
            str4 = strDecodeStringElement3;
            str3 = strDecodeStringElement2;
            i = 63;
            str2 = strDecodeStringElement;
        } else {
            boolean z = true;
            int i3 = 0;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            List list2 = null;
            TicketBookingTripDetailsApiModel ticketBookingTripDetailsApiModel2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 5;
                        break;
                    case 0:
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str5);
                        i3 |= 1;
                        i2 = 5;
                        break;
                    case 1:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        break;
                    case 2:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 |= 4;
                        break;
                    case 3:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 |= 8;
                        break;
                    case 4:
                        list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), list2);
                        i3 |= 16;
                        break;
                    case 5:
                        ticketBookingTripDetailsApiModel2 = (TicketBookingTripDetailsApiModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i2, TicketBookingTripDetailsApiModel$$serializer.f8109a, ticketBookingTripDetailsApiModel2);
                        i3 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            str = str5;
            str2 = strDecodeStringElement4;
            str3 = strDecodeStringElement5;
            str4 = strDecodeStringElement6;
            list = list2;
            ticketBookingTripDetailsApiModel = ticketBookingTripDetailsApiModel2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TicketFinalFareRequestApiModel(i, str, str2, str3, str4, list, ticketBookingTripDetailsApiModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        TicketFinalFareRequestApiModel value = (TicketFinalFareRequestApiModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = TicketFinalFareRequestApiModel.g;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, value.f5426a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, (SerializationStrategy) lazyArr[4].getValue(), value.e);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, TicketBookingTripDetailsApiModel$$serializer.f8109a, value.f);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
