package app.chalo.mticket.ui.tripinfo;

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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/mticket/ui/tripinfo/MTicketTripInfoRestoredState.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoRestoredState;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class MTicketTripInfoRestoredState$$serializer implements GeneratedSerializer<MTicketTripInfoRestoredState> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MTicketTripInfoRestoredState$$serializer f5776a;
    private static final SerialDescriptor descriptor;

    static {
        MTicketTripInfoRestoredState$$serializer mTicketTripInfoRestoredState$$serializer = new MTicketTripInfoRestoredState$$serializer();
        f5776a = mTicketTripInfoRestoredState$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.mticket.ui.tripinfo.MTicketTripInfoRestoredState", mTicketTripInfoRestoredState$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("source", false);
        pluginGeneratedSerialDescriptor.j("route", false);
        pluginGeneratedSerialDescriptor.j("fromStop", false);
        pluginGeneratedSerialDescriptor.j("toStop", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = BuiltinSerializersKt.c((KSerializer) MTicketTripInfoRestoredState.e[0].getValue());
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(ProductBookingRouteDetails$$serializer.f8195a);
        ProductBookingStopDetails$$serializer productBookingStopDetails$$serializer = ProductBookingStopDetails$$serializer.f8200a;
        return new KSerializer[]{kSerializerC, kSerializerC2, BuiltinSerializersKt.c(productBookingStopDetails$$serializer), BuiltinSerializersKt.c(productBookingStopDetails$$serializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        Source source;
        ProductBookingRouteDetails productBookingRouteDetails;
        ProductBookingStopDetails productBookingStopDetails;
        ProductBookingStopDetails productBookingStopDetails2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = MTicketTripInfoRestoredState.e;
        Source source2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Source source3 = (Source) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), null);
            ProductBookingRouteDetails productBookingRouteDetails2 = (ProductBookingRouteDetails) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, ProductBookingRouteDetails$$serializer.f8195a, null);
            ProductBookingStopDetails$$serializer productBookingStopDetails$$serializer = ProductBookingStopDetails$$serializer.f8200a;
            ProductBookingStopDetails productBookingStopDetails3 = (ProductBookingStopDetails) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, productBookingStopDetails$$serializer, null);
            source = source3;
            productBookingRouteDetails = productBookingRouteDetails2;
            productBookingStopDetails2 = (ProductBookingStopDetails) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, productBookingStopDetails$$serializer, null);
            productBookingStopDetails = productBookingStopDetails3;
            i = 15;
        } else {
            boolean z = true;
            int i2 = 0;
            ProductBookingRouteDetails productBookingRouteDetails3 = null;
            ProductBookingStopDetails productBookingStopDetails4 = null;
            ProductBookingStopDetails productBookingStopDetails5 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    source2 = (Source) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), source2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    productBookingRouteDetails3 = (ProductBookingRouteDetails) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, ProductBookingRouteDetails$$serializer.f8195a, productBookingRouteDetails3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    productBookingStopDetails4 = (ProductBookingStopDetails) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, ProductBookingStopDetails$$serializer.f8200a, productBookingStopDetails4);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    productBookingStopDetails5 = (ProductBookingStopDetails) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, ProductBookingStopDetails$$serializer.f8200a, productBookingStopDetails5);
                    i2 |= 8;
                }
            }
            i = i2;
            source = source2;
            productBookingRouteDetails = productBookingRouteDetails3;
            productBookingStopDetails = productBookingStopDetails4;
            productBookingStopDetails2 = productBookingStopDetails5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MTicketTripInfoRestoredState(i, source, productBookingRouteDetails, productBookingStopDetails, productBookingStopDetails2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        MTicketTripInfoRestoredState value = (MTicketTripInfoRestoredState) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, (SerializationStrategy) MTicketTripInfoRestoredState.e[0].getValue(), value.f5775a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, ProductBookingRouteDetails$$serializer.f8195a, value.b);
        ProductBookingStopDetails$$serializer productBookingStopDetails$$serializer = ProductBookingStopDetails$$serializer.f8200a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, productBookingStopDetails$$serializer, value.c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, productBookingStopDetails$$serializer, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
