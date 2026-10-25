package app.chalo.ondc.model.api.request;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/ondc/model/api/request/OndcBookingRequestApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/ondc/model/api/request/OndcBookingRequestApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class OndcBookingRequestApiModel$$serializer implements GeneratedSerializer<OndcBookingRequestApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final OndcBookingRequestApiModel$$serializer f6739a;
    private static final SerialDescriptor descriptor;

    static {
        OndcBookingRequestApiModel$$serializer ondcBookingRequestApiModel$$serializer = new OndcBookingRequestApiModel$$serializer();
        f6739a = ondcBookingRequestApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.ondc.model.api.request.OndcBookingRequestApiModel", ondcBookingRequestApiModel$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("configurationId", false);
        pluginGeneratedSerialDescriptor.j("city", false);
        pluginGeneratedSerialDescriptor.j("passengerDetails", false);
        pluginGeneratedSerialDescriptor.j("tripDetail", false);
        pluginGeneratedSerialDescriptor.j("customerInfo", false);
        pluginGeneratedSerialDescriptor.j("providerId", false);
        pluginGeneratedSerialDescriptor.j("transactionId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = OndcBookingRequestApiModel.h;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{stringSerializer, stringSerializer, lazyArr[2].getValue(), OndcTicketTripDetails$$serializer.f6749a, OndcCustomerInfoApiModel$$serializer.f6743a, stringSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        String str2;
        List list;
        OndcTicketTripDetails ondcTicketTripDetails;
        OndcCustomerInfoApiModel ondcCustomerInfoApiModel;
        String str3;
        String strDecodeStringElement;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = OndcBookingRequestApiModel.h;
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), null);
            OndcTicketTripDetails ondcTicketTripDetails2 = (OndcTicketTripDetails) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, OndcTicketTripDetails$$serializer.f6749a, null);
            OndcCustomerInfoApiModel ondcCustomerInfoApiModel2 = (OndcCustomerInfoApiModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, OndcCustomerInfoApiModel$$serializer.f6743a, null);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            list = list2;
            str = strDecodeStringElement3;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            str3 = strDecodeStringElement5;
            ondcTicketTripDetails = ondcTicketTripDetails2;
            ondcCustomerInfoApiModel = ondcCustomerInfoApiModel2;
            i = 127;
            str2 = strDecodeStringElement4;
        } else {
            boolean z = true;
            int i2 = 0;
            String strDecodeStringElement6 = null;
            List list3 = null;
            OndcTicketTripDetails ondcTicketTripDetails3 = null;
            OndcCustomerInfoApiModel ondcCustomerInfoApiModel3 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 |= 2;
                        break;
                    case 2:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), list3);
                        i2 |= 4;
                        break;
                    case 3:
                        ondcTicketTripDetails3 = (OndcTicketTripDetails) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, OndcTicketTripDetails$$serializer.f6749a, ondcTicketTripDetails3);
                        i2 |= 8;
                        break;
                    case 4:
                        ondcCustomerInfoApiModel3 = (OndcCustomerInfoApiModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, OndcCustomerInfoApiModel$$serializer.f6743a, ondcCustomerInfoApiModel3);
                        i2 |= 16;
                        break;
                    case 5:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i2 |= 32;
                        break;
                    case 6:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i2 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i2;
            str = strDecodeStringElement2;
            str2 = strDecodeStringElement6;
            list = list3;
            ondcTicketTripDetails = ondcTicketTripDetails3;
            ondcCustomerInfoApiModel = ondcCustomerInfoApiModel3;
            str3 = strDecodeStringElement7;
            strDecodeStringElement = strDecodeStringElement8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OndcBookingRequestApiModel(i, str, str2, list, ondcTicketTripDetails, ondcCustomerInfoApiModel, str3, strDecodeStringElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        OndcBookingRequestApiModel value = (OndcBookingRequestApiModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = OndcBookingRequestApiModel.h;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f6738a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (SerializationStrategy) lazyArr[2].getValue(), value.c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, OndcTicketTripDetails$$serializer.f6749a, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, OndcCustomerInfoApiModel$$serializer.f6743a, value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.g);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
