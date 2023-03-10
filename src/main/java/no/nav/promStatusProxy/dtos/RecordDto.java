package no.nav.promStatusProxy.dtos;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.io.File;
import java.net.URI;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RecordDto {
    private UUID id = null;

    private OffsetDateTime timestamp = null;

    private UUID serviceId = null;

    private StatusDto status = null;

    private String description = null;

    private String logLink = null;

    private Integer responseTime = null;

    public static String[] readOnlyFields() {
        return new String[] {
        };
    }

    public static String[] writeOnlyFields() {
        return new String[] {
        };
    }

    public static String[] requiredFields() {
        return new String[] {
        };
    }

    public List<String> missingRequiredFields() {
        List<String> result = new ArrayList<>();
        return result;
    }

    public void readOnlyFieldsWithValue(List<String> result) {
    }

    private boolean isMissing(String s) {
        return s == null || s.isEmpty();
    }

    private boolean isMissing(List<?> list) {
        return list == null;
    }

    private boolean isMissing(Object s) {
        return s == null;
    }


    /**
     * Get id
     * @return id
     */
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public RecordDto id(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Get timestamp
     * example: 2017-07-21T17:30Z
     * @return timestamp
     */
    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public RecordDto timestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get serviceId
     * @return serviceId
     */
    public UUID getServiceId() {
        return serviceId;
    }

    public void setServiceId(UUID serviceId) {
        this.serviceId = serviceId;
    }

    public RecordDto serviceId(UUID serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public StatusDto getStatus() {
        return status;
    }

    public void setStatus(StatusDto status) {
        this.status = status;
    }

    public RecordDto status(StatusDto status) {
        this.status = status;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RecordDto description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get logLink
     * @return logLink
     */
    public String getLogLink() {
        return logLink;
    }

    public void setLogLink(String logLink) {
        this.logLink = logLink;
    }

    public RecordDto logLink(String logLink) {
        this.logLink = logLink;
        return this;
    }

    /**
     * Get responseTime
     * @return responseTime
     */
    public Integer getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(Integer responseTime) {
        this.responseTime = responseTime;
    }

    public RecordDto responseTime(Integer responseTime) {
        this.responseTime = responseTime;
        return this;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecordDto record = (RecordDto) o;
        return Objects.equals(this.getId(), record.getId()) &&
                Objects.equals(this.getTimestamp(), record.getTimestamp()) &&
                Objects.equals(this.getServiceId(), record.getServiceId()) &&
                Objects.equals(this.getStatus(), record.getStatus()) &&
                Objects.equals(this.getDescription(), record.getDescription()) &&
                Objects.equals(this.getLogLink(), record.getLogLink()) &&
                Objects.equals(this.getResponseTime(), record.getResponseTime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTimestamp(), getServiceId(), getStatus(), getDescription(), getLogLink(), getResponseTime());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecordDto {\n");
        sb.append("    id: ").append(toIndentedString(getId())).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(getTimestamp())).append("\n");
        sb.append("    serviceId: ").append(toIndentedString(getServiceId())).append("\n");
        sb.append("    status: ").append(toIndentedString(getStatus())).append("\n");
        sb.append("    description: ").append(toIndentedString(getDescription())).append("\n");
        sb.append("    logLink: ").append(toIndentedString(getLogLink())).append("\n");
        sb.append("    responseTime: ").append(toIndentedString(getResponseTime())).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

