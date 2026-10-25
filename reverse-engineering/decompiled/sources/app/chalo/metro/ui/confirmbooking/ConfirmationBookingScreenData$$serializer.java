package app.chalo.metro.ui.confirmbooking;

import app.chalo.models.productbooking.ChaloTicketBookingMode;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/metro/ui/confirmbooking/ConfirmationBookingScreenData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/metro/ui/confirmbooking/ConfirmationBookingScreenData;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class ConfirmationBookingScreenData$$serializer implements GeneratedSerializer<ConfirmationBookingScreenData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConfirmationBookingScreenData$$serializer f5471a;
    private static final SerialDescriptor descriptor;

    static {
        ConfirmationBookingScreenData$$serializer confirmationBookingScreenData$$serializer = new ConfirmationBookingScreenData$$serializer();
        f5471a = confirmationBookingScreenData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.metro.ui.confirmbooking.ConfirmationBookingScreenData", confirmationBookingScreenData$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("transitMode", false);
        pluginGeneratedSerialDescriptor.j("bookingMode", false);
        pluginGeneratedSerialDescriptor.j("configId", false);
        pluginGeneratedSerialDescriptor.j("agencyName", false);
        pluginGeneratedSerialDescriptor.j("tripDetails", false);
        pluginGeneratedSerialDescriptor.j("passengerDetailsList", false);
        pluginGeneratedSerialDescriptor.j("tncList", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = ConfirmationBookingScreenData.h;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue(), stringSerializer, stringSerializer, ConfirmationScreenTripDetails$$serializer.f5473a, lazyArr[5].getValue(), BuiltinSerializersKt.c((KSerializer) lazyArr[6].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        List list;
        List list2;
        ChaloTransitMode chaloTransitMode;
        ChaloTicketBookingMode chaloTicketBookingMode;
        String str;
        String str2;
        ConfirmationScreenTripDetails confirmationScreenTripDetails;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ConfirmationBookingScreenData.h;
        int i2 = 3;
        int i3 = 4;
        ChaloTransitMode chaloTransitMode2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            ChaloTransitMode chaloTransitMode3 = (ChaloTransitMode) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), null);
            ChaloTicketBookingMode chaloTicketBookingMode2 = (ChaloTicketBookingMode) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            ConfirmationScreenTripDetails confirmationScreenTripDetails2 = (ConfirmationScreenTripDetails) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, ConfirmationScreenTripDetails$$serializer.f5473a, null);
            List list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), null);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), null);
            chaloTransitMode = chaloTransitMode3;
            str2 = strDecodeStringElement2;
            confirmationScreenTripDetails = confirmationScreenTripDetails2;
            str = strDecodeStringElement;
            i = 127;
            list2 = list3;
            chaloTicketBookingMode = chaloTicketBookingMode2;
        } else {
            int i4 = 1;
            boolean z = true;
            int i5 = 0;
            List list4 = null;
            List list5 = null;
            ChaloTicketBookingMode chaloTicketBookingMode3 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            ConfirmationScreenTripDetails confirmationScreenTripDetails3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 4;
                        i4 = 1;
                        break;
                    case 0:
                        chaloTransitMode2 = (ChaloTransitMode) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), chaloTransitMode2);
                        i5 |= 1;
                        i2 = 3;
                        i3 = 4;
                        i4 = 1;
                        break;
                    case 1:
                        chaloTicketBookingMode3 = (ChaloTicketBookingMode) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i4, (DeserializationStrategy) lazyArr[i4].getValue(), chaloTicketBookingMode3);
                        i5 |= 2;
                        i2 = 3;
                        i3 = 4;
                        break;
                    case 2:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i5 |= 4;
                        break;
                    case 3:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        i5 |= 8;
                        break;
                    case 4:
                        confirmationScreenTripDetails3 = (ConfirmationScreenTripDetails) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i3, ConfirmationScreenTripDetails$$serializer.f5473a, confirmationScreenTripDetails3);
                        i5 |= 16;
                        break;
                    case 5:
                        list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), list5);
                        i5 |= 32;
                        break;
                    case 6:
                        list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), list4);
                        i5 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i5;
            list = list4;
            list2 = list5;
            chaloTransitMode = chaloTransitMode2;
            chaloTicketBookingMode = chaloTicketBookingMode3;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
            confirmationScreenTripDetails = confirmationScreenTripDetails3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ConfirmationBookingScreenData(i, chaloTransitMode, chaloTicketBookingMode, str, str2, confirmationScreenTripDetails, list2, list);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ConfirmationBookingScreenData value = (ConfirmationBookingScreenData) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ConfirmationBookingScreenData.h;
        SerializationStrategy serializationStrategy = (SerializationStrategy) lazyArr[0].getValue();
        ChaloTransitMode chaloTransitMode = value.f5470a;
        List list = value.g;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, serializationStrategy, chaloTransitMode);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (SerializationStrategy) lazyArr[1].getValue(), value.b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, ConfirmationScreenTripDetails$$serializer.f5473a, value.e);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, (SerializationStrategy) lazyArr[5].getValue(), value.f);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, (SerializationStrategy) lazyArr[6].getValue(), list);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
