package app.chalo.ticketvalidation;

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
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/ticketvalidation/TicketValidationInfoEntity.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/ticketvalidation/TicketValidationInfoEntity;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class TicketValidationInfoEntity$$serializer implements GeneratedSerializer<TicketValidationInfoEntity> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TicketValidationInfoEntity$$serializer f9626a;
    private static final SerialDescriptor descriptor;

    static {
        TicketValidationInfoEntity$$serializer ticketValidationInfoEntity$$serializer = new TicketValidationInfoEntity$$serializer();
        f9626a = ticketValidationInfoEntity$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.ticketvalidation.TicketValidationInfoEntity", ticketValidationInfoEntity$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j(CLConstants.FIELD_CODE, false);
        pluginGeneratedSerialDescriptor.j("ticketNumber", true);
        pluginGeneratedSerialDescriptor.j("validationStatus", true);
        pluginGeneratedSerialDescriptor.j("metaInfo", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = TicketValidationInfoEntity.f;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{lazyArr[0].getValue(), stringSerializer, BuiltinSerializersKt.c(stringSerializer), lazyArr[3].getValue(), BuiltinSerializersKt.c(TicketValidationMetaInfo$$serializer.f9628a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        TicketValidationType ticketValidationType;
        String str;
        String str2;
        QRValidationStatus qRValidationStatus;
        TicketValidationMetaInfo ticketValidationMetaInfo;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = TicketValidationInfoEntity.f;
        int i2 = 0;
        TicketValidationType ticketValidationType2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            TicketValidationType ticketValidationType3 = (TicketValidationType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, null);
            qRValidationStatus = (QRValidationStatus) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), null);
            ticketValidationType = ticketValidationType3;
            ticketValidationMetaInfo = (TicketValidationMetaInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, TicketValidationMetaInfo$$serializer.f9628a, null);
            str2 = str3;
            i = 31;
            str = strDecodeStringElement;
        } else {
            int i3 = 1;
            int i4 = 0;
            String strDecodeStringElement2 = null;
            String str4 = null;
            QRValidationStatus qRValidationStatus2 = null;
            TicketValidationMetaInfo ticketValidationMetaInfo2 = null;
            while (i3 != 0) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                int i5 = i2;
                if (iDecodeElementIndex == -1) {
                    i2 = i5;
                    i3 = i2;
                } else if (iDecodeElementIndex != 0) {
                    if (iDecodeElementIndex == 1) {
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                    } else if (iDecodeElementIndex == 2) {
                        str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str4);
                        i4 |= 4;
                    } else if (iDecodeElementIndex == 3) {
                        qRValidationStatus2 = (QRValidationStatus) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), qRValidationStatus2);
                        i4 |= 8;
                    } else {
                        if (iDecodeElementIndex != 4) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        ticketValidationMetaInfo2 = (TicketValidationMetaInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, TicketValidationMetaInfo$$serializer.f9628a, ticketValidationMetaInfo2);
                        i4 |= 16;
                    }
                    i2 = i5;
                } else {
                    ticketValidationType2 = (TicketValidationType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i5, (DeserializationStrategy) lazyArr[i5].getValue(), ticketValidationType2);
                    i4 |= 1;
                    i2 = i5;
                }
            }
            i = i4;
            ticketValidationType = ticketValidationType2;
            str = strDecodeStringElement2;
            str2 = str4;
            qRValidationStatus = qRValidationStatus2;
            ticketValidationMetaInfo = ticketValidationMetaInfo2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TicketValidationInfoEntity(i, ticketValidationType, str, str2, qRValidationStatus, ticketValidationMetaInfo);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        TicketValidationInfoEntity value = (TicketValidationInfoEntity) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = TicketValidationInfoEntity.f;
        SerializationStrategy serializationStrategy = (SerializationStrategy) lazyArr[0].getValue();
        TicketValidationType ticketValidationType = value.f9625a;
        TicketValidationMetaInfo ticketValidationMetaInfo = value.e;
        QRValidationStatus qRValidationStatus = value.d;
        String str = value.c;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, serializationStrategy, ticketValidationType);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.b);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || qRValidationStatus != QRValidationStatus.UNKNOWN) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (SerializationStrategy) lazyArr[3].getValue(), qRValidationStatus);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || ticketValidationMetaInfo != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, TicketValidationMetaInfo$$serializer.f9628a, ticketValidationMetaInfo);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
