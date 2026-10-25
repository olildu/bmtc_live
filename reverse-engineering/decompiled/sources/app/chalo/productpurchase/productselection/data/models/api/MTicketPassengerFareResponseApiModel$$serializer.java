package app.chalo.productpurchase.productselection.data.models.api;

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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/productpurchase/productselection/data/models/api/MTicketPassengerFareResponseApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/api/MTicketPassengerFareResponseApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class MTicketPassengerFareResponseApiModel$$serializer implements GeneratedSerializer<MTicketPassengerFareResponseApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MTicketPassengerFareResponseApiModel$$serializer f8584a;
    private static final SerialDescriptor descriptor;

    static {
        MTicketPassengerFareResponseApiModel$$serializer mTicketPassengerFareResponseApiModel$$serializer = new MTicketPassengerFareResponseApiModel$$serializer();
        f8584a = mTicketPassengerFareResponseApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.productpurchase.productselection.data.models.api.MTicketPassengerFareResponseApiModel", mTicketPassengerFareResponseApiModel$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("f", false);
        pluginGeneratedSerialDescriptor.j("ff", false);
        pluginGeneratedSerialDescriptor.j("d", false);
        pluginGeneratedSerialDescriptor.j("f_br", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        DoubleSerializer doubleSerializer = DoubleSerializer.f18137a;
        return new KSerializer[]{BuiltinSerializersKt.c(doubleSerializer), BuiltinSerializersKt.c(doubleSerializer), BuiltinSerializersKt.c(doubleSerializer), BuiltinSerializersKt.c(MTicketPassengerFareBreakdownResponseApiModel$$serializer.f8582a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        Double d;
        Double d2;
        Double d3;
        MTicketPassengerFareBreakdownResponseApiModel mTicketPassengerFareBreakdownResponseApiModel;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Double d4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            DoubleSerializer doubleSerializer = DoubleSerializer.f18137a;
            Double d5 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, doubleSerializer, null);
            Double d6 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, doubleSerializer, null);
            d3 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, doubleSerializer, null);
            mTicketPassengerFareBreakdownResponseApiModel = (MTicketPassengerFareBreakdownResponseApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, MTicketPassengerFareBreakdownResponseApiModel$$serializer.f8582a, null);
            i = 15;
            d2 = d6;
            d = d5;
        } else {
            boolean z = true;
            int i2 = 0;
            Double d7 = null;
            Double d8 = null;
            MTicketPassengerFareBreakdownResponseApiModel mTicketPassengerFareBreakdownResponseApiModel2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    d4 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, DoubleSerializer.f18137a, d4);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    d7 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, DoubleSerializer.f18137a, d7);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    d8 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, DoubleSerializer.f18137a, d8);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    mTicketPassengerFareBreakdownResponseApiModel2 = (MTicketPassengerFareBreakdownResponseApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, MTicketPassengerFareBreakdownResponseApiModel$$serializer.f8582a, mTicketPassengerFareBreakdownResponseApiModel2);
                    i2 |= 8;
                }
            }
            i = i2;
            d = d4;
            d2 = d7;
            d3 = d8;
            mTicketPassengerFareBreakdownResponseApiModel = mTicketPassengerFareBreakdownResponseApiModel2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MTicketPassengerFareResponseApiModel(i, d, d2, d3, mTicketPassengerFareBreakdownResponseApiModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        MTicketPassengerFareResponseApiModel value = (MTicketPassengerFareResponseApiModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        DoubleSerializer doubleSerializer = DoubleSerializer.f18137a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, doubleSerializer, value.f8583a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, doubleSerializer, value.b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, doubleSerializer, value.c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, MTicketPassengerFareBreakdownResponseApiModel$$serializer.f8582a, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
