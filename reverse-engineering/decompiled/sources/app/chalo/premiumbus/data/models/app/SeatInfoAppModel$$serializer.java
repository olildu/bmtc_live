package app.chalo.premiumbus.data.models.app;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/premiumbus/data/models/app/SeatInfoAppModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/premiumbus/data/models/app/SeatInfoAppModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class SeatInfoAppModel$$serializer implements GeneratedSerializer<SeatInfoAppModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SeatInfoAppModel$$serializer f7123a;
    private static final SerialDescriptor descriptor;

    static {
        SeatInfoAppModel$$serializer seatInfoAppModel$$serializer = new SeatInfoAppModel$$serializer();
        f7123a = seatInfoAppModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.premiumbus.data.models.app.SeatInfoAppModel", seatInfoAppModel$$serializer, 13);
        pluginGeneratedSerialDescriptor.j("seatId", false);
        pluginGeneratedSerialDescriptor.j("seatType", false);
        pluginGeneratedSerialDescriptor.j("seatNumber", false);
        pluginGeneratedSerialDescriptor.j("status", false);
        pluginGeneratedSerialDescriptor.j("reservationType", false);
        pluginGeneratedSerialDescriptor.j("x", false);
        pluginGeneratedSerialDescriptor.j("y", false);
        pluginGeneratedSerialDescriptor.j("z", false);
        pluginGeneratedSerialDescriptor.j("isSelectedByUser", false);
        pluginGeneratedSerialDescriptor.j("availableOnAllSlots", true);
        pluginGeneratedSerialDescriptor.j("bufferType", true);
        pluginGeneratedSerialDescriptor.j("autoAssign", true);
        pluginGeneratedSerialDescriptor.j("womenAdjacencyPromise", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = SeatInfoAppModel.n;
        IntSerializer intSerializer = IntSerializer.f18146a;
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        return new KSerializer[]{intSerializer, lazyArr[1].getValue(), StringSerializer.f18170a, lazyArr[3].getValue(), lazyArr[4].getValue(), intSerializer, intSerializer, intSerializer, booleanSerializer, booleanSerializer, lazyArr[10].getValue(), booleanSerializer, booleanSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SeatType seatType;
        int i;
        ReservationType reservationType;
        BufferType bufferType;
        int i2;
        SeatStatus seatStatus;
        String str;
        boolean zDecodeBooleanElement;
        boolean z;
        int i3;
        int i4;
        int i5;
        boolean z2;
        boolean zDecodeBooleanElement2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SeatInfoAppModel.n;
        int i6 = 9;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            seatType = (SeatType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            SeatStatus seatStatus2 = (SeatStatus) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), null);
            ReservationType reservationType2 = (ReservationType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), null);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
            bufferType = (BufferType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, (DeserializationStrategy) lazyArr[10].getValue(), null);
            i = iDecodeIntElement;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
            z = zDecodeBooleanElement4;
            i3 = iDecodeIntElement4;
            i4 = iDecodeIntElement3;
            i5 = iDecodeIntElement2;
            z2 = zDecodeBooleanElement3;
            str = strDecodeStringElement;
            zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
            seatStatus = seatStatus2;
            reservationType = reservationType2;
            i2 = 8191;
        } else {
            int i7 = 12;
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            int iDecodeIntElement5 = 0;
            int iDecodeIntElement6 = 0;
            int iDecodeIntElement7 = 0;
            boolean zDecodeBooleanElement7 = false;
            boolean zDecodeBooleanElement8 = false;
            ReservationType reservationType3 = null;
            String strDecodeStringElement2 = null;
            int i8 = 3;
            int i9 = 4;
            boolean z3 = true;
            int iDecodeIntElement8 = 0;
            int i10 = 0;
            seatType = null;
            BufferType bufferType2 = null;
            SeatStatus seatStatus3 = null;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                        i7 = 12;
                        i8 = 3;
                        i9 = 4;
                        break;
                    case 0:
                        iDecodeIntElement8 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i10 |= 1;
                        i7 = 12;
                        i6 = 9;
                        i8 = 3;
                        i9 = 4;
                        break;
                    case 1:
                        seatType = (SeatType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), seatType);
                        i10 |= 2;
                        i7 = 12;
                        i6 = 9;
                        i8 = 3;
                        i9 = 4;
                        break;
                    case 2:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i10 |= 4;
                        i7 = 12;
                        i6 = 9;
                        i9 = 4;
                        break;
                    case 3:
                        seatStatus3 = (SeatStatus) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i8, (DeserializationStrategy) lazyArr[i8].getValue(), seatStatus3);
                        i10 |= 8;
                        i7 = 12;
                        i6 = 9;
                        i9 = 4;
                        break;
                    case 4:
                        reservationType3 = (ReservationType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i9, (DeserializationStrategy) lazyArr[i9].getValue(), reservationType3);
                        i10 |= 16;
                        i7 = 12;
                        i6 = 9;
                        break;
                    case 5:
                        iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
                        i10 |= 32;
                        i7 = 12;
                        break;
                    case 6:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
                        i10 |= 64;
                        i7 = 12;
                        break;
                    case 7:
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
                        i10 |= 128;
                        i7 = 12;
                        break;
                    case 8:
                        zDecodeBooleanElement7 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
                        i10 |= 256;
                        i7 = 12;
                        break;
                    case 9:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i6);
                        i10 |= 512;
                        i7 = 12;
                        break;
                    case 10:
                        bufferType2 = (BufferType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, (DeserializationStrategy) lazyArr[10].getValue(), bufferType2);
                        i10 |= 1024;
                        i7 = 12;
                        break;
                    case 11:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
                        i10 |= 2048;
                        break;
                    case 12:
                        zDecodeBooleanElement8 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i7);
                        i10 |= 4096;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = iDecodeIntElement8;
            reservationType = reservationType3;
            bufferType = bufferType2;
            i2 = i10;
            seatStatus = seatStatus3;
            str = strDecodeStringElement2;
            zDecodeBooleanElement = zDecodeBooleanElement5;
            z = zDecodeBooleanElement6;
            i3 = iDecodeIntElement5;
            i4 = iDecodeIntElement6;
            i5 = iDecodeIntElement7;
            z2 = zDecodeBooleanElement7;
            zDecodeBooleanElement2 = zDecodeBooleanElement8;
        }
        SeatType seatType2 = seatType;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SeatInfoAppModel(i2, i, seatType2, str, seatStatus, reservationType, i5, i4, i3, z2, z, bufferType, zDecodeBooleanElement, zDecodeBooleanElement2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        SeatInfoAppModel value = (SeatInfoAppModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SeatInfoAppModel.n;
        int i = value.f7122a;
        boolean z = value.m;
        boolean z2 = value.l;
        BufferType bufferType = value.k;
        boolean z3 = value.j;
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 0, i);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (SerializationStrategy) lazyArr[1].getValue(), value.b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (SerializationStrategy) lazyArr[3].getValue(), value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, (SerializationStrategy) lazyArr[4].getValue(), value.e);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 6, value.g);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 7, value.h);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 8, value.i);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9) || !z3) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 9, z3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 10) || bufferType != BufferType.NONE) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 10, (SerializationStrategy) lazyArr[10].getValue(), bufferType);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 11) || z2) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 11, z2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 12) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 12, z);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
