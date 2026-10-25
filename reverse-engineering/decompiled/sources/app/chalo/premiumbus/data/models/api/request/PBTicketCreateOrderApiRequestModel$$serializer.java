package app.chalo.premiumbus.data.models.api.request;

import in.juspay.hypersdk.core.PaymentConstants;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/premiumbus/data/models/api/request/PBTicketCreateOrderApiRequestModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/premiumbus/data/models/api/request/PBTicketCreateOrderApiRequestModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class PBTicketCreateOrderApiRequestModel$$serializer implements GeneratedSerializer<PBTicketCreateOrderApiRequestModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PBTicketCreateOrderApiRequestModel$$serializer f6997a;
    private static final SerialDescriptor descriptor;

    static {
        PBTicketCreateOrderApiRequestModel$$serializer pBTicketCreateOrderApiRequestModel$$serializer = new PBTicketCreateOrderApiRequestModel$$serializer();
        f6997a = pBTicketCreateOrderApiRequestModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.premiumbus.data.models.api.request.PBTicketCreateOrderApiRequestModel", pBTicketCreateOrderApiRequestModel$$serializer, 9);
        pluginGeneratedSerialDescriptor.j("tripId", false);
        pluginGeneratedSerialDescriptor.j("configId", false);
        pluginGeneratedSerialDescriptor.j(PaymentConstants.AMOUNT, false);
        pluginGeneratedSerialDescriptor.j("tripDetail", false);
        pluginGeneratedSerialDescriptor.j("passengerDetails", false);
        pluginGeneratedSerialDescriptor.j("appliedRules", false);
        pluginGeneratedSerialDescriptor.j("seats", false);
        pluginGeneratedSerialDescriptor.j("userAcquisitionChannel", false);
        pluginGeneratedSerialDescriptor.j("userCampaign", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = PBTicketCreateOrderApiRequestModel.j;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{stringSerializer, stringSerializer, LongSerializer.f18151a, PBTicketSelectedTripDetailsApiRequestModel$$serializer.f7001a, lazyArr[4].getValue(), BuiltinSerializersKt.c((KSerializer) lazyArr[5].getValue()), lazyArr[6].getValue(), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        List list;
        String str2;
        List list2;
        List list3;
        String str3;
        String str4;
        PBTicketSelectedTripDetailsApiRequestModel pBTicketSelectedTripDetailsApiRequestModel;
        long j;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = PBTicketCreateOrderApiRequestModel.j;
        int i2 = 7;
        int i3 = 5;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
            PBTicketSelectedTripDetailsApiRequestModel pBTicketSelectedTripDetailsApiRequestModel2 = (PBTicketSelectedTripDetailsApiRequestModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, PBTicketSelectedTripDetailsApiRequestModel$$serializer.f7001a, null);
            List list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), null);
            List list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), null);
            List list6 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), null);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            list = list6;
            str3 = strDecodeStringElement2;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            pBTicketSelectedTripDetailsApiRequestModel = pBTicketSelectedTripDetailsApiRequestModel2;
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            list3 = list4;
            i = 511;
            list2 = list5;
            str4 = strDecodeStringElement3;
            j = jDecodeLongElement;
        } else {
            int i4 = 4;
            boolean z = true;
            int i5 = 0;
            String str5 = null;
            List list7 = null;
            String str6 = null;
            List list8 = null;
            List list9 = null;
            long jDecodeLongElement2 = 0;
            String strDecodeStringElement4 = null;
            PBTicketSelectedTripDetailsApiRequestModel pBTicketSelectedTripDetailsApiRequestModel3 = null;
            while (z) {
                int i6 = i3;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 5;
                        i4 = 4;
                        break;
                    case 0:
                        i5 |= 1;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 = 7;
                        i3 = 5;
                        i4 = 4;
                        break;
                    case 1:
                        i5 |= 2;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 = 7;
                        i3 = 5;
                        i4 = 4;
                        break;
                    case 2:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
                        i5 |= 4;
                        i2 = 7;
                        i3 = 5;
                        i4 = 4;
                        break;
                    case 3:
                        pBTicketSelectedTripDetailsApiRequestModel3 = (PBTicketSelectedTripDetailsApiRequestModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, PBTicketSelectedTripDetailsApiRequestModel$$serializer.f7001a, pBTicketSelectedTripDetailsApiRequestModel3);
                        i5 |= 8;
                        i2 = 7;
                        i3 = 5;
                        i4 = 4;
                        break;
                    case 4:
                        list9 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i4, (DeserializationStrategy) lazyArr[i4].getValue(), list9);
                        i5 |= 16;
                        i2 = 7;
                        i3 = 5;
                        break;
                    case 5:
                        list8 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, (DeserializationStrategy) lazyArr[i6].getValue(), list8);
                        i5 |= 32;
                        i3 = i6;
                        i2 = 7;
                        break;
                    case 6:
                        list7 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), list7);
                        i5 |= 64;
                        i3 = i6;
                        break;
                    case 7:
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.f18170a, str5);
                        i5 |= 128;
                        i3 = i6;
                        break;
                    case 8:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.f18170a, str6);
                        i5 |= 256;
                        i3 = i6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i5;
            str = str5;
            list = list7;
            str2 = str6;
            list2 = list8;
            list3 = list9;
            str3 = strDecodeStringElement;
            str4 = strDecodeStringElement4;
            pBTicketSelectedTripDetailsApiRequestModel = pBTicketSelectedTripDetailsApiRequestModel3;
            j = jDecodeLongElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PBTicketCreateOrderApiRequestModel(i, str3, str4, j, pBTicketSelectedTripDetailsApiRequestModel, list3, list2, list, str, str2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        PBTicketCreateOrderApiRequestModel value = (PBTicketCreateOrderApiRequestModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = PBTicketCreateOrderApiRequestModel.j;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f6996a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.b);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 2, value.c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, PBTicketSelectedTripDetailsApiRequestModel$$serializer.f7001a, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, (SerializationStrategy) lazyArr[4].getValue(), value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, (SerializationStrategy) lazyArr[5].getValue(), value.f);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, (SerializationStrategy) lazyArr[6].getValue(), value.g);
        StringSerializer stringSerializer = StringSerializer.f18170a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, value.h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, value.i);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
