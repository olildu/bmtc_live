package app.chalo.providers.cityprovider.impl.data.models.app;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/providers/cityprovider/impl/data/models/app/AgencyInfoAppModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/providers/cityprovider/impl/data/models/app/AgencyInfoAppModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class AgencyInfoAppModel$$serializer implements GeneratedSerializer<AgencyInfoAppModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AgencyInfoAppModel$$serializer f8853a;
    private static final SerialDescriptor descriptor;

    static {
        AgencyInfoAppModel$$serializer agencyInfoAppModel$$serializer = new AgencyInfoAppModel$$serializer();
        f8853a = agencyInfoAppModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.providers.cityprovider.impl.data.models.app.AgencyInfoAppModel", agencyInfoAppModel$$serializer, 10);
        pluginGeneratedSerialDescriptor.j("agencyName", false);
        pluginGeneratedSerialDescriptor.j("liveFeedUrlAvailable", false);
        pluginGeneratedSerialDescriptor.j("productEnabled", false);
        pluginGeneratedSerialDescriptor.j("isQuickPayEnabled", false);
        pluginGeneratedSerialDescriptor.j("isWalletEnabled", false);
        pluginGeneratedSerialDescriptor.j("isClosedLoopWalletEnabled", false);
        pluginGeneratedSerialDescriptor.j("isOnlineCardRechargeAvailable", false);
        pluginGeneratedSerialDescriptor.j("priority", false);
        pluginGeneratedSerialDescriptor.j("isOndcProductAvailable", false);
        pluginGeneratedSerialDescriptor.j("isTicketBookingEnabled", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        return new KSerializer[]{StringSerializer.f18170a, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, IntSerializer.f18146a, booleanSerializer, booleanSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String strDecodeStringElement;
        boolean zDecodeBooleanElement;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            boolean zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            boolean zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
            boolean zDecodeBooleanElement7 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
            boolean zDecodeBooleanElement8 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
            i2 = 1023;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
            i = iDecodeIntElement;
            z = zDecodeBooleanElement7;
            z2 = zDecodeBooleanElement6;
            z3 = zDecodeBooleanElement4;
            z4 = zDecodeBooleanElement8;
            z5 = zDecodeBooleanElement5;
            z6 = zDecodeBooleanElement3;
            z7 = zDecodeBooleanElement2;
        } else {
            strDecodeStringElement = null;
            boolean z8 = true;
            boolean zDecodeBooleanElement9 = false;
            int iDecodeIntElement2 = 0;
            boolean zDecodeBooleanElement10 = false;
            boolean zDecodeBooleanElement11 = false;
            boolean zDecodeBooleanElement12 = false;
            boolean zDecodeBooleanElement13 = false;
            boolean zDecodeBooleanElement14 = false;
            boolean zDecodeBooleanElement15 = false;
            boolean zDecodeBooleanElement16 = false;
            while (z8) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z8 = false;
                        break;
                    case 0:
                        i2 |= 1;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        continue;
                    case 1:
                        zDecodeBooleanElement16 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i2 |= 2;
                        continue;
                    case 2:
                        zDecodeBooleanElement15 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                        i2 |= 4;
                        break;
                    case 3:
                        zDecodeBooleanElement12 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                        i2 |= 8;
                        break;
                    case 4:
                        zDecodeBooleanElement14 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i2 |= 16;
                        break;
                    case 5:
                        zDecodeBooleanElement11 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                        i2 |= 32;
                        break;
                    case 6:
                        zDecodeBooleanElement10 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
                        i2 |= 64;
                        break;
                    case 7:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
                        i2 |= 128;
                        break;
                    case 8:
                        zDecodeBooleanElement13 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
                        i2 |= 256;
                        break;
                    case 9:
                        zDecodeBooleanElement9 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
                        i2 |= 512;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement9;
            i = iDecodeIntElement2;
            z = zDecodeBooleanElement10;
            z2 = zDecodeBooleanElement11;
            z3 = zDecodeBooleanElement12;
            z4 = zDecodeBooleanElement13;
            z5 = zDecodeBooleanElement14;
            z6 = zDecodeBooleanElement15;
            z7 = zDecodeBooleanElement16;
        }
        String str = strDecodeStringElement;
        int i3 = i2;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AgencyInfoAppModel(i3, str, z7, z6, z3, z5, z2, z, i, z4, zDecodeBooleanElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        AgencyInfoAppModel value = (AgencyInfoAppModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f8852a);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 1, value.b);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 2, value.c);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 6, value.g);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 7, value.h);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 8, value.i);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 9, value.j);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
