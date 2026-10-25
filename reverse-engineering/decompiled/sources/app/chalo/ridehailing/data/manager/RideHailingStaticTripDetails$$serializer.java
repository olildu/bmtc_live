package app.chalo.ridehailing.data.manager;

import app.chalo.ridehailing.data.app.RideHailingBookingDriverDetailsAppModel;
import app.chalo.ridehailing.data.app.RideHailingBookingDriverDetailsAppModel$$serializer;
import app.chalo.ridehailing.data.app.RideHailingBookingWaypointAppModel;
import app.chalo.ridehailing.data.app.RideHailingBookingWaypointAppModel$$serializer;
import app.chalo.ridehailing.data.app.RideHailingVehicleDetailsAppModel;
import app.chalo.ridehailing.data.app.RideHailingVehicleDetailsAppModel$$serializer;
import in.juspay.hypersdk.core.PaymentConstants;
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
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/ridehailing/data/manager/RideHailingStaticTripDetails.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/ridehailing/data/manager/RideHailingStaticTripDetails;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class RideHailingStaticTripDetails$$serializer implements GeneratedSerializer<RideHailingStaticTripDetails> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RideHailingStaticTripDetails$$serializer f9126a;
    private static final SerialDescriptor descriptor;

    static {
        RideHailingStaticTripDetails$$serializer rideHailingStaticTripDetails$$serializer = new RideHailingStaticTripDetails$$serializer();
        f9126a = rideHailingStaticTripDetails$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.ridehailing.data.manager.RideHailingStaticTripDetails", rideHailingStaticTripDetails$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("tripId", false);
        pluginGeneratedSerialDescriptor.j("pickup", false);
        pluginGeneratedSerialDescriptor.j("drop", false);
        pluginGeneratedSerialDescriptor.j("driver", false);
        pluginGeneratedSerialDescriptor.j("vehicle", false);
        pluginGeneratedSerialDescriptor.j(CLConstants.OTP, false);
        pluginGeneratedSerialDescriptor.j(PaymentConstants.AMOUNT, false);
        pluginGeneratedSerialDescriptor.j("paymentMode", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(stringSerializer);
        RideHailingBookingWaypointAppModel$$serializer rideHailingBookingWaypointAppModel$$serializer = RideHailingBookingWaypointAppModel$$serializer.f9113a;
        return new KSerializer[]{stringSerializer, rideHailingBookingWaypointAppModel$$serializer, rideHailingBookingWaypointAppModel$$serializer, RideHailingBookingDriverDetailsAppModel$$serializer.f9108a, RideHailingVehicleDetailsAppModel$$serializer.f9118a, stringSerializer, LongSerializer.f18151a, kSerializerC};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        String str2;
        RideHailingBookingWaypointAppModel rideHailingBookingWaypointAppModel;
        RideHailingBookingWaypointAppModel rideHailingBookingWaypointAppModel2;
        RideHailingBookingDriverDetailsAppModel rideHailingBookingDriverDetailsAppModel;
        RideHailingVehicleDetailsAppModel rideHailingVehicleDetailsAppModel;
        String str3;
        long j;
        boolean z;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 7;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            RideHailingBookingWaypointAppModel$$serializer rideHailingBookingWaypointAppModel$$serializer = RideHailingBookingWaypointAppModel$$serializer.f9113a;
            RideHailingBookingWaypointAppModel rideHailingBookingWaypointAppModel3 = (RideHailingBookingWaypointAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, rideHailingBookingWaypointAppModel$$serializer, null);
            RideHailingBookingWaypointAppModel rideHailingBookingWaypointAppModel4 = (RideHailingBookingWaypointAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, rideHailingBookingWaypointAppModel$$serializer, null);
            RideHailingBookingDriverDetailsAppModel rideHailingBookingDriverDetailsAppModel2 = (RideHailingBookingDriverDetailsAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, RideHailingBookingDriverDetailsAppModel$$serializer.f9108a, null);
            RideHailingVehicleDetailsAppModel rideHailingVehicleDetailsAppModel2 = (RideHailingVehicleDetailsAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, RideHailingVehicleDetailsAppModel$$serializer.f9118a, null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 6);
            str2 = strDecodeStringElement2;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, null);
            i = 255;
            str3 = strDecodeStringElement3;
            rideHailingBookingDriverDetailsAppModel = rideHailingBookingDriverDetailsAppModel2;
            rideHailingVehicleDetailsAppModel = rideHailingVehicleDetailsAppModel2;
            rideHailingBookingWaypointAppModel2 = rideHailingBookingWaypointAppModel4;
            rideHailingBookingWaypointAppModel = rideHailingBookingWaypointAppModel3;
            j = jDecodeLongElement;
        } else {
            boolean z2 = true;
            int i3 = 0;
            String str4 = null;
            RideHailingBookingDriverDetailsAppModel rideHailingBookingDriverDetailsAppModel3 = null;
            RideHailingVehicleDetailsAppModel rideHailingVehicleDetailsAppModel3 = null;
            String strDecodeStringElement4 = null;
            long jDecodeLongElement2 = 0;
            RideHailingBookingWaypointAppModel rideHailingBookingWaypointAppModel5 = null;
            RideHailingBookingWaypointAppModel rideHailingBookingWaypointAppModel6 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        break;
                    case 0:
                        z = true;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 7;
                        break;
                    case 1:
                        z = true;
                        rideHailingBookingWaypointAppModel5 = (RideHailingBookingWaypointAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, RideHailingBookingWaypointAppModel$$serializer.f9113a, rideHailingBookingWaypointAppModel5);
                        i3 |= 2;
                        i2 = 7;
                        break;
                    case 2:
                        rideHailingBookingWaypointAppModel6 = (RideHailingBookingWaypointAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, RideHailingBookingWaypointAppModel$$serializer.f9113a, rideHailingBookingWaypointAppModel6);
                        i3 |= 4;
                        break;
                    case 3:
                        rideHailingBookingDriverDetailsAppModel3 = (RideHailingBookingDriverDetailsAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, RideHailingBookingDriverDetailsAppModel$$serializer.f9108a, rideHailingBookingDriverDetailsAppModel3);
                        i3 |= 8;
                        break;
                    case 4:
                        rideHailingVehicleDetailsAppModel3 = (RideHailingVehicleDetailsAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, RideHailingVehicleDetailsAppModel$$serializer.f9118a, rideHailingVehicleDetailsAppModel3);
                        i3 |= 16;
                        break;
                    case 5:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i3 |= 32;
                        break;
                    case 6:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 6);
                        i3 |= 64;
                        break;
                    case 7:
                        str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.f18170a, str4);
                        i3 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            str = str4;
            str2 = strDecodeStringElement;
            rideHailingBookingWaypointAppModel = rideHailingBookingWaypointAppModel5;
            rideHailingBookingWaypointAppModel2 = rideHailingBookingWaypointAppModel6;
            rideHailingBookingDriverDetailsAppModel = rideHailingBookingDriverDetailsAppModel3;
            rideHailingVehicleDetailsAppModel = rideHailingVehicleDetailsAppModel3;
            str3 = strDecodeStringElement4;
            j = jDecodeLongElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RideHailingStaticTripDetails(i, str2, rideHailingBookingWaypointAppModel, rideHailingBookingWaypointAppModel2, rideHailingBookingDriverDetailsAppModel, rideHailingVehicleDetailsAppModel, str3, j, str);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        RideHailingStaticTripDetails value = (RideHailingStaticTripDetails) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        String str = value.f9125a;
        String str2 = value.h;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        RideHailingBookingWaypointAppModel$$serializer rideHailingBookingWaypointAppModel$$serializer = RideHailingBookingWaypointAppModel$$serializer.f9113a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, rideHailingBookingWaypointAppModel$$serializer, value.b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, rideHailingBookingWaypointAppModel$$serializer, value.c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, RideHailingBookingDriverDetailsAppModel$$serializer.f9108a, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, RideHailingVehicleDetailsAppModel$$serializer.f9118a, value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 6, value.g);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str2);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
