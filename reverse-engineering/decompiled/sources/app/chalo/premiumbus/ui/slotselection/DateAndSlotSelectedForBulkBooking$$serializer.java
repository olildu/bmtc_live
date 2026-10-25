package app.chalo.premiumbus.ui.slotselection;

import app.chalo.uistate.dialog.DateAvailabilityStatus;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.serializers.LocalDateTimeSerializer;
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
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/premiumbus/ui/slotselection/DateAndSlotSelectedForBulkBooking.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/premiumbus/ui/slotselection/DateAndSlotSelectedForBulkBooking;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class DateAndSlotSelectedForBulkBooking$$serializer implements GeneratedSerializer<DateAndSlotSelectedForBulkBooking> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DateAndSlotSelectedForBulkBooking$$serializer f7796a;
    private static final SerialDescriptor descriptor;

    static {
        DateAndSlotSelectedForBulkBooking$$serializer dateAndSlotSelectedForBulkBooking$$serializer = new DateAndSlotSelectedForBulkBooking$$serializer();
        f7796a = dateAndSlotSelectedForBulkBooking$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.premiumbus.ui.slotselection.DateAndSlotSelectedForBulkBooking", dateAndSlotSelectedForBulkBooking$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j(CLConstants.SHARED_PREFERENCE_ITEM_DATE, false);
        pluginGeneratedSerialDescriptor.j("remark", false);
        pluginGeneratedSerialDescriptor.j("slots", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = DateAndSlotSelectedForBulkBooking.e;
        return new KSerializer[]{StringSerializer.f18170a, LocalDateTimeSerializer.f18068a, lazyArr[2].getValue(), lazyArr[3].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        LocalDateTime localDateTime;
        DateAvailabilityStatus dateAvailabilityStatus;
        List list;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = DateAndSlotSelectedForBulkBooking.e;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            LocalDateTime localDateTime2 = (LocalDateTime) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, LocalDateTimeSerializer.f18068a, null);
            DateAvailabilityStatus dateAvailabilityStatus2 = (DateAvailabilityStatus) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), null);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), null);
            str = strDecodeStringElement2;
            i = 15;
            dateAvailabilityStatus = dateAvailabilityStatus2;
            localDateTime = localDateTime2;
        } else {
            boolean z = true;
            int i2 = 0;
            LocalDateTime localDateTime3 = null;
            DateAvailabilityStatus dateAvailabilityStatus3 = null;
            List list2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    localDateTime3 = (LocalDateTime) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, LocalDateTimeSerializer.f18068a, localDateTime3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    dateAvailabilityStatus3 = (DateAvailabilityStatus) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), dateAvailabilityStatus3);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), list2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = strDecodeStringElement;
            localDateTime = localDateTime3;
            dateAvailabilityStatus = dateAvailabilityStatus3;
            list = list2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new DateAndSlotSelectedForBulkBooking(i, str, localDateTime, dateAvailabilityStatus, list);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        DateAndSlotSelectedForBulkBooking value = (DateAndSlotSelectedForBulkBooking) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = DateAndSlotSelectedForBulkBooking.e;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f7795a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, LocalDateTimeSerializer.f18068a, value.b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (SerializationStrategy) lazyArr[2].getValue(), value.c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (SerializationStrategy) lazyArr[3].getValue(), value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
