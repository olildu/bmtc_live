package app.chalo.instantticket.data.model.api.request;

import app.chalo.instantticket.data.model.app.InstantTicketTripDetails;
import app.chalo.instantticket.data.model.app.InstantTicketTripDetails$$serializer;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/instantticket/data/model/api/request/ValidateInstantTicketFareRequestApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/instantticket/data/model/api/request/ValidateInstantTicketFareRequestApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class ValidateInstantTicketFareRequestApiModel$$serializer implements GeneratedSerializer<ValidateInstantTicketFareRequestApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ValidateInstantTicketFareRequestApiModel$$serializer f3860a;
    private static final SerialDescriptor descriptor;

    static {
        ValidateInstantTicketFareRequestApiModel$$serializer validateInstantTicketFareRequestApiModel$$serializer = new ValidateInstantTicketFareRequestApiModel$$serializer();
        f3860a = validateInstantTicketFareRequestApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.instantticket.data.model.api.request.ValidateInstantTicketFareRequestApiModel", validateInstantTicketFareRequestApiModel$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("city", false);
        pluginGeneratedSerialDescriptor.j("finalFare", false);
        pluginGeneratedSerialDescriptor.j("passengerDetails", false);
        pluginGeneratedSerialDescriptor.j("tripDetail", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{StringSerializer.f18170a, LongSerializer.f18151a, ValidateInstantTicketFareRequestApiModel.e[2].getValue(), InstantTicketTripDetails$$serializer.f3884a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        long j;
        List list;
        InstantTicketTripDetails instantTicketTripDetails;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ValidateInstantTicketFareRequestApiModel.e;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), null);
            str = strDecodeStringElement2;
            instantTicketTripDetails = (InstantTicketTripDetails) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, InstantTicketTripDetails$$serializer.f3884a, null);
            i = 15;
            j = jDecodeLongElement;
        } else {
            long jDecodeLongElement2 = 0;
            boolean z = true;
            int i2 = 0;
            List list2 = null;
            InstantTicketTripDetails instantTicketTripDetails2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), list2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    instantTicketTripDetails2 = (InstantTicketTripDetails) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, InstantTicketTripDetails$$serializer.f3884a, instantTicketTripDetails2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = strDecodeStringElement;
            j = jDecodeLongElement2;
            list = list2;
            instantTicketTripDetails = instantTicketTripDetails2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ValidateInstantTicketFareRequestApiModel(i, str, j, list, instantTicketTripDetails);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ValidateInstantTicketFareRequestApiModel value = (ValidateInstantTicketFareRequestApiModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ValidateInstantTicketFareRequestApiModel.e;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f3859a);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 1, value.b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (SerializationStrategy) lazyArr[2].getValue(), value.c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, InstantTicketTripDetails$$serializer.f3884a, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
