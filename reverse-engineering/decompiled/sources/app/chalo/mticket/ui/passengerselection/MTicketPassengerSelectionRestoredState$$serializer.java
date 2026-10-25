package app.chalo.mticket.ui.passengerselection;

import app.chalo.constants.Source;
import app.chalo.productbooking.common.data.models.app.ProductBookingRouteDetails;
import app.chalo.productbooking.common.data.models.app.ProductBookingRouteDetails$$serializer;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails$$serializer;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionRestoredState.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionRestoredState;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class MTicketPassengerSelectionRestoredState$$serializer implements GeneratedSerializer<MTicketPassengerSelectionRestoredState> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MTicketPassengerSelectionRestoredState$$serializer f5756a;
    private static final SerialDescriptor descriptor;

    static {
        MTicketPassengerSelectionRestoredState$$serializer mTicketPassengerSelectionRestoredState$$serializer = new MTicketPassengerSelectionRestoredState$$serializer();
        f5756a = mTicketPassengerSelectionRestoredState$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionRestoredState", mTicketPassengerSelectionRestoredState$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("productConfigId", false);
        pluginGeneratedSerialDescriptor.j("route", false);
        pluginGeneratedSerialDescriptor.j("fromStop", false);
        pluginGeneratedSerialDescriptor.j("toStop", false);
        pluginGeneratedSerialDescriptor.j("source", false);
        pluginGeneratedSerialDescriptor.j("passengerSelectionContainer", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = MTicketPassengerSelectionRestoredState.g;
        KSerializer kSerializerC = BuiltinSerializersKt.c(StringSerializer.f18170a);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c((KSerializer) lazyArr[4].getValue());
        KSerializer kSerializerC3 = BuiltinSerializersKt.c(MTicketPassengerSelectionContainer$$serializer.f5742a);
        ProductBookingStopDetails$$serializer productBookingStopDetails$$serializer = ProductBookingStopDetails$$serializer.f8200a;
        return new KSerializer[]{kSerializerC, ProductBookingRouteDetails$$serializer.f8195a, productBookingStopDetails$$serializer, productBookingStopDetails$$serializer, kSerializerC2, kSerializerC3};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        ProductBookingRouteDetails productBookingRouteDetails;
        ProductBookingStopDetails productBookingStopDetails;
        ProductBookingStopDetails productBookingStopDetails2;
        Source source;
        MTicketPassengerSelectionContainer mTicketPassengerSelectionContainer;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = MTicketPassengerSelectionRestoredState.g;
        int i2 = 5;
        String str2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, null);
            ProductBookingRouteDetails productBookingRouteDetails2 = (ProductBookingRouteDetails) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, ProductBookingRouteDetails$$serializer.f8195a, null);
            ProductBookingStopDetails$$serializer productBookingStopDetails$$serializer = ProductBookingStopDetails$$serializer.f8200a;
            ProductBookingStopDetails productBookingStopDetails3 = (ProductBookingStopDetails) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, productBookingStopDetails$$serializer, null);
            ProductBookingStopDetails productBookingStopDetails4 = (ProductBookingStopDetails) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, productBookingStopDetails$$serializer, null);
            source = (Source) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), null);
            str = str3;
            mTicketPassengerSelectionContainer = (MTicketPassengerSelectionContainer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, MTicketPassengerSelectionContainer$$serializer.f5742a, null);
            productBookingStopDetails2 = productBookingStopDetails4;
            productBookingStopDetails = productBookingStopDetails3;
            i = 63;
            productBookingRouteDetails = productBookingRouteDetails2;
        } else {
            boolean z = true;
            int i3 = 0;
            ProductBookingRouteDetails productBookingRouteDetails3 = null;
            ProductBookingStopDetails productBookingStopDetails5 = null;
            ProductBookingStopDetails productBookingStopDetails6 = null;
            Source source2 = null;
            MTicketPassengerSelectionContainer mTicketPassengerSelectionContainer2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 5;
                        break;
                    case 0:
                        str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str2);
                        i3 |= 1;
                        i2 = 5;
                        break;
                    case 1:
                        productBookingRouteDetails3 = (ProductBookingRouteDetails) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, ProductBookingRouteDetails$$serializer.f8195a, productBookingRouteDetails3);
                        i3 |= 2;
                        break;
                    case 2:
                        productBookingStopDetails5 = (ProductBookingStopDetails) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, ProductBookingStopDetails$$serializer.f8200a, productBookingStopDetails5);
                        i3 |= 4;
                        break;
                    case 3:
                        productBookingStopDetails6 = (ProductBookingStopDetails) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, ProductBookingStopDetails$$serializer.f8200a, productBookingStopDetails6);
                        i3 |= 8;
                        break;
                    case 4:
                        source2 = (Source) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), source2);
                        i3 |= 16;
                        break;
                    case 5:
                        mTicketPassengerSelectionContainer2 = (MTicketPassengerSelectionContainer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, MTicketPassengerSelectionContainer$$serializer.f5742a, mTicketPassengerSelectionContainer2);
                        i3 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            str = str2;
            productBookingRouteDetails = productBookingRouteDetails3;
            productBookingStopDetails = productBookingStopDetails5;
            productBookingStopDetails2 = productBookingStopDetails6;
            source = source2;
            mTicketPassengerSelectionContainer = mTicketPassengerSelectionContainer2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MTicketPassengerSelectionRestoredState(i, str, productBookingRouteDetails, productBookingStopDetails, productBookingStopDetails2, source, mTicketPassengerSelectionContainer);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        MTicketPassengerSelectionRestoredState value = (MTicketPassengerSelectionRestoredState) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = MTicketPassengerSelectionRestoredState.g;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, value.f5755a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, ProductBookingRouteDetails$$serializer.f8195a, value.b);
        ProductBookingStopDetails$$serializer productBookingStopDetails$$serializer = ProductBookingStopDetails$$serializer.f8200a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, productBookingStopDetails$$serializer, value.c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, productBookingStopDetails$$serializer, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, (SerializationStrategy) lazyArr[4].getValue(), value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, MTicketPassengerSelectionContainer$$serializer.f5742a, value.f);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
